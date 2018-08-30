package com.atguigu.java;

import org.junit.Test;

import java.io.*;


public class IOTest5 {
    @Test
    public void test(){

        FileInputStream fis = null;
        InputStreamReader isr = null;
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        try {
            File file = new File("demo.txt");
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);

            File file2 = new File("demo2.txt");
            fos = new FileOutputStream(file2);
            osw = new OutputStreamWriter(fos);

            char[] c = new char[1024];
            int len = 0;
            while((len = isr.read(c)) != -1){
                osw.write(c,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (osw != null) {
                    osw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (isr != null) {
                    isr.close();
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
}
