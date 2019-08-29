package com.hepingfly.principle.ocp.improve;

/**
 * 改进思路：
 * 把 Shape 做成抽象类，并提供一个抽象的 draw 方法，让子类去实现即可
 * 这样有新的图形种类时，只需要让新的图形类继承 Shape,并实现 draw 方法，这样使用方就不需要修改代码
 * 满足了开闭原则
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor();
        ge.drawShape(new Rectangle());
        ge.drawShape(new Circle());
        // 可以很方便的进行扩展，调用方不需要改动，只需要新增一个类,对扩展开放，对修改关闭
        ge.drawShape(new Triangle());
    }
}

// 绘图类
class GraphicEditor {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

// Shape类，基类
abstract class Shape {
    int type;

    protected abstract void draw();
}

class Rectangle extends Shape {
    public Rectangle() {
        super.type = 1;
    }

    @Override
    protected void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    public Circle() {
        super.type = 2;
    }

    @Override
    protected void draw() {
        System.out.println("绘制圆形");
    }
}

// 假如我现在想扩展一个类
class Triangle extends Shape {
    @Override
    protected void draw() {
        System.out.println("绘制三角形");
    }
}
