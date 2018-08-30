package com.atguigu.java;

import org.junit.Test;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class IOTest {

    @Test
    public void test(){
        new Scanner(System.in);
        System.out.println("aaa");
    }

    @Test
    public void test2() throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(true){
            String str = br.readLine();
            if ("e".equalsIgnoreCase(str) || "exit".equalsIgnoreCase(str)){
                br.close();
                isr.close();
                return;
            }else{
                System.out.println(str.toUpperCase());
            }
        }


    }
}
