package com.atguigu.java;

import org.junit.Test;

import java.io.*;

public class IOTest3 {

    @Test
    public void test3(){
        FileWriter writer = null;
        try {
            writer = new FileWriter("hhh.txt");
            writer.write("大家好我爱你们么么哒".toCharArray());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
//    FileReader
    @Test
    public void test(){

        FileReader reader = null;
        try {
            reader = new FileReader("aaa.txt");
            char[] c = new char[500];
            int len = 0;
            while((len = reader.read(c)) != -1){
                System.out.println(new String(c,0,len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//读取中文可能会发生乱码的问题
    @Test
    public void test2(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("aaa.txt");

            byte[] b = new byte[10];
            int len = 0;
            while ((len = fis.read(b)) != -1){
                System.out.println(new String(b,0,len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
