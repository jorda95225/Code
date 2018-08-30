package com.atguigu.exer;

public class Student<K> implements Comparable{
    K k;

    public void setK(K k){
        this.k = k;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public <E> E getE(E e){
        return e;
    }
}
