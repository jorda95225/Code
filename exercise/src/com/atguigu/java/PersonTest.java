package com.atguigu.java;

public class PersonTest {
    public static void main(String[] args) {

        PersonTest personTest = new PersonTest();
        personTest.test(new Teacher());
        personTest.test(new Student());

    }

    public void test(Runner runner){
        runner.run();
        if (runner instanceof Student){
            ((Student) runner).say();
        }
    }
}

interface Runner{
    void run();
}

class Student implements Runner{

    @Override
    public void run() {
        System.out.println("学生跑步");
    }

    public void say(){
        System.out.println("学生说话");
    }
}

class Teacher implements Runner{
    @Override
    public void run() {
        System.out.println("老师跑步");
    }
}

class Worker implements Runner{

    @Override
    public void run() {
        System.out.println("工人跑步");
    }
}
