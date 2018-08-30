package com.atguigu.java;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

public class ATest {

    @Test
    public void test(){
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {
            fis = new FileInputStream("aaa.txt");
            bis = new BufferedInputStream(fis);

            fos = new FileOutputStream("abc.txt");
            bos = new BufferedOutputStream(fos);

            byte[] b = new byte[1024];
            int len = 0;
            while((len = bis.read(b)) != -1){
                bos.write(b,0,len);
            }

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
                if(fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2(){
        File file = new File("F:\\io\\io\\aaa.txt ");
        if (! file.exists()){
            if (! file.getParentFile().exists()){
                file.mkdirs();
            }else{
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test3(){


    }

}
