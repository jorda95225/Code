package com.atguigu.java;


import org.junit.Test;

import java.io.*;

public class IOTest {
//    文件输入流
    @Test
    public void test()  {

        FileInputStream fis = null;
        try {
            File file = new File("demo.txt");
            fis = new FileInputStream(file);
            byte[] b = new byte[1024];
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

//        文件输出流
    @Test
    public void test2(){
        FileOutputStream fos = null;
        try {
            File file = new File("aaa.txt");
            fos = new FileOutputStream(file);
            fos.write("abc".getBytes());
            fos.write("bds".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
//    一边读一边写
    @Test
    public void test3(){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file = new File("aaa.txt");
            File file2 = new File("bbb.txt");

            fis = new FileInputStream(file);
            fos = new FileOutputStream(file2);

            byte[] b = new byte[1024];
            int len = 0;
            while((len = fis.read(b)) != -1){
                fos.write(b,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {

                try {
                    if (fos != null)
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


                try {
                    if (fis != null)
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }

    }

//    实现文件复制功能
    @Test
    public void test4(){

        long start = System.currentTimeMillis();

        String desc = "C:\\Users\\11579\\Desktop\\bbb.avi";
        String src = "C:\\Users\\11579\\Desktop\\aaa.avi";
        copy(desc,src);

        long end = System.currentTimeMillis();
        System.out.println("time= " + (end - start));//2187

    }

    public void copy(String desc, String src) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {

            File descFile = new File(desc);
            File srcFile = new File(src);

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(descFile);

            byte[] b = new byte[1024];
            int len = 0;
            while ((len = fis.read(b)) != -1){
                fos.write(b,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {

            try {
                if(fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}



