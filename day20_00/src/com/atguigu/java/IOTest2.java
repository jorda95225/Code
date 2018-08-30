package com.atguigu.java;

import org.junit.Test;

import java.io.*;

public class IOTest2 {


//    使用缓存区实现文件复制功能
    @Test
    public void test3(){

        long start = System.currentTimeMillis();
        String src = "C:\\Users\\11579\\Desktop\\aaa.avi";
        String desc = "C:\\Users\\11579\\Desktop\\bbb.avi";
        copy(desc,src);
        long end = System.currentTimeMillis();
        System.out.println("time= " + (end - start));


    }

    public void copy(String desc, String src) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {

            fis = new FileInputStream(src);
            bis = new BufferedInputStream(fis);
            fos = new FileOutputStream(desc);
            bos = new BufferedOutputStream(fos);

            byte[] b = new byte[1024];
            int len = 0;
            while ((len = bis.read(b)) != -1) {
                bos.write(b, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



//    BufferedOutputStream
    @Test
    public void test2(){

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            fos = new FileOutputStream("ccc.txt");
            bos = new BufferedOutputStream(fos);

            bos.write("12345".getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    BufferedInputStream
    @Test
    public void test(){

        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            fis = new FileInputStream("aaa.txt");
            bis = new BufferedInputStream(fis);

            byte[] b = new byte[1024];
            int len = 0;
            while((len = bis.read(b)) != -1){
                System.out.println(new String(b,0,len));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
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
