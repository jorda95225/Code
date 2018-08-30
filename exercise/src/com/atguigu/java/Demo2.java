package com.atguigu.java;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("abc.txt");
            br = new BufferedReader(fr);

            fw = new FileWriter("bbb.txt");
            bw = new BufferedWriter(fw);

            String str = "";
            while((str = br.readLine()) != null){
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{

            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (br != null){
                br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
