package com.atguigu.java;



import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生个数");
        int n = s.nextInt();
        int[] scores = new int[n];
        int maxScore = scores[0];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入学生成绩");
            int score = s.nextInt();
            scores[i] = score;
            if (scores[i] > maxScore){
                maxScore = scores[i];
            }
        }
        System.out.println("最高分为：" + maxScore);

        for (int i = 0; i < scores.length; i++) {
            char level;
            if (scores[i] >= maxScore - 10){
                level = 'A';
            }else if (scores[i] >= maxScore - 20){
                level = 'B';
            }else if (scores[i] >= maxScore - 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("student " + i + "score is " + scores[i] + "grade is " + level );
        }
    }
}
