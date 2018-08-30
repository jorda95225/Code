package com.atguigu.java;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(){

        this.radius = 1.0;
    }
    public Circle(double radius){

        this.radius = radius;
    }
    public Circle(double radius,String color,double weight){

        super(color,weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public boolean equals(Circle c){
        return this.radius == c.radius;
    }


    public String toString(){
        return "radius= " + radius;
    }
}
