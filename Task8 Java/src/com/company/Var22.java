package com.company;
import java.awt.*;
import java.util.*;

public class Var22 {

    public static boolean[][] answer;
    public static void Solution22(int[][] c){
        /*Scanner in = new Scanner(System.in);
        int h,w;
        System.out.print("Введите высоту массива: ");
        h = in.nextInt();
        System.out.print("Введите ширину массива: ");
        w = in.nextInt();
        c = new int[h][w];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {

                double x = (Math.random() * 10);
                int a = (int) x;
                c[i][j] = a;
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {

                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }*/
        answer = new boolean[c.length][c[0].length];
        int maxHeight,maxWidth,minHeight,minWidth, k;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                k = 0;
                for (int z = 0; z < c[i].length; z++) {
                    if (c[i][k]<c[i][z]) k=z;
                }
                maxWidth = c[i][k];
                k = 0;
                for (int z = 0; z < c[i].length; z++) {
                    if (c[i][k]>c[i][z]) k=z;
                }
                minWidth = c[i][k];
                k = 0;
                for (int z = 0; z < c.length; z++) {
                    if (c[k][j]<c[z][j]) k=z;
                }
                maxHeight = c[k][j];
                k = 0;
                for (int z = 0; z < c.length; z++) {
                    if (c[k][j]>c[z][j]) k=z;
                }
                minHeight = c[k][j];
                if (c[i][j] == minWidth && c[i][j] == maxHeight || c[i][j] == maxWidth && c[i][j] == minHeight ){
                    answer [i][j] = true;
                }else{
                    answer [i][j] = false;
                }


            }
        }
        /*for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (answer[i][j] == true)
                    System.out.print("true  ");
                else
                    System.out.print("false ");

            }
            System.out.println();
        }*/

    }

    public boolean[][] GetAnswerArray() {
        return this.answer;
    }
}

