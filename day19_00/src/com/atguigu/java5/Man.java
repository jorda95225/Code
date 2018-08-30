package com.atguigu.java5;

public class Man<T> {
    T t;

    public void setT(T t){
        this.t = t;
    }

    public T getT(){
        return t;
    }

    public <E> E setE(E e){
        return e;
    }

    public static <E> E setE2(E e){
        return e;
    }

    public void show(){

    }
//静态方法中不能使用泛型类，泛型接口中的泛型类型
    /*public static void show2(T t){

    }*/
}
