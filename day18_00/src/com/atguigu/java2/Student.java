package com.atguigu.java2;

public class Student implements Comparable{

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "(" + name + " " + age + ")";
    }

    @Override
    public int compareTo(Object o) {
       /* if (o instanceof Student){
            Student s = (Student)o;
            return this.age - s.age;
        }*/

       if (o instanceof Student){
           Student s = (Student)o;
           int a = this.age - s.age;
           if (a == 0){
               return this.name.compareTo(s.name);
           }
           return a;
       }
        return 0;
    }
}
