package com.atguigu.java;

import org.junit.Test;

import java.io.*;

public class IOTest4 {


    @Test
    public void test2(){
        FileWriter writer = null;
        BufferedWriter bw = null;
        try {
            writer = new FileWriter("ddd.txt");
            bw = new BufferedWriter(writer);
            bw.write("快点吧，我等到花儿都谢了！");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public void test(){
        FileReader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader("aaa.txt");
            br = new BufferedReader(reader);
            String str = "";
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
