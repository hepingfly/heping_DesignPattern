package com.hepingfly.prototype.deepclone;

import java.io.*;

/**
 * Created by shenheping on 2019/9/18.
 */
public class DeepProtoType implements Serializable,Cloneable {

    private String name;
    private DeepCloneableTarget target;

    /**
     * 深拷贝实现方式1：重写clone 方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        DeepProtoType d = (DeepProtoType) clone;
        DeepCloneableTarget t = (DeepCloneableTarget)target.clone();
        d.target = t;
        return d;
    }

    public void setTarget(DeepCloneableTarget target) {
        this.target = target;
    }

    /**
     * 实现方式二：
     * 通过对象序列化实现
     * @return
     */
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        DeepProtoType deepProtoType = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);  // 当前这个对象以流的形式输出
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            deepProtoType = (DeepProtoType) ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (Exception e) {

            }
        }
        return deepProtoType;
    }
}
