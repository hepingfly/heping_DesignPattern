package com.hepingfly.principle.ocp;

/**
 * 开闭原则
 * 下面代码设计的方式
 * 优点是比较好理解，简单易操作
 * 缺点是违反了 ocp 原则，即当我们给类增加新功能的时候，尽量不修改代码，或尽可能少的修改代码
 * 比如，我们要绘制一个三角形，会发现需要修改大量代码
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor();
        ge.drawShape(new Rectangle());
        ge.drawShape(new Circle());
    }
}

// 绘图类
class GraphicEditor {
    public void drawShape(Shape shape) {
        if (shape.type == 1) {
            drawRectangle(shape);
        } else if (shape.type == 2) {
            drawCircle(shape);
        }

    }
    public void drawRectangle(Shape shape) {
        System.out.println("矩形");
    }
    public void drawCircle(Shape shape) {
        System.out.println("圆形");
    }

}

// Shape类，基类
class Shape {
    int type;
}

class Rectangle extends Shape {
    public Rectangle() {
        super.type = 1;
    }
}

class Circle extends Shape {
    public Circle() {
        super.type = 2;
    }
}