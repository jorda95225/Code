package com.atguigu.java;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1,"white",2);
        Circle c2 = new Circle(1,"white",2);

        System.out.println(c1.getColor().equals(c2.getColor()));
        System.out.println(c1.getRadius() == c2.getRadius());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
