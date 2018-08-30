package com.atguigu.java2;

import org.junit.Test;

import java.lang.reflect.*;

public class ReflectionTest {

//    通过反射给对象中的属性进行赋值
    @Test
    public void test() throws NoSuchFieldException, IllegalAccessException {

        Class clazz = Student.class;
        Student student = new Student();
        Field declaredField = clazz.getDeclaredField("age");
        declaredField.setAccessible(true);
        declaredField.set(student,12);
        System.out.println(student.getAge());
    }

//    通过反射调用对象中的方法
    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = Student.class;
        Student student = new Student();
        Method declaredMethod = clazz.getDeclaredMethod("info",int.class);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(student,13);
    }

//    通过反射获取类中的属性
    @Test
    public void test3(){
        Class clazz = Student.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field:declaredFields) {
            System.out.println(field);
        }
    }

//    通过反射获取类中的方法
    @Test
    public void test4(){
        Class clazz = Student.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method:declaredMethods) {
            System.out.println(method);
        }
    }

//    通过反射获取父类的泛型
    @Test
    public void test5(){
        Class clazz = Student.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType t = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = t.getActualTypeArguments();
        for (Type type : actualTypeArguments) {
            System.out.println(type);
        }
    }
}
