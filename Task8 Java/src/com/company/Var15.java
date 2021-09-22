package com.company;
import java.awt.*;
import java.util.*;

public class Var15 {
    public static int QuadSum = -100000, QuadSumTemp, QuadSide = 2, QuadSideMax = 2;
    public static void Solution15(int[][]c) {
        /*Scanner in = new Scanner(System.in);
        int h, w;
        System.out.print("Введите высоту массива (минимум 2): ");
        h = in.nextInt();
        System.out.print("Введите ширину массива (минимум 2): ");
        w = in.nextInt();*/
        //int [][]c = new int[h][w];
        /*Random r = new Random(System.currentTimeMillis());
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {

                int x = r.nextInt(19) - 9;
                ;
                c[i][j] = x;

            }
        }*/
        /*for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (c[i][j] >= 0)
                    System.out.print(" " + c[i][j] + " ");
                else
                    System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }*/
        int h = c.length;
        int w = c[0].length;

        while (QuadSide <= h && QuadSide <= w) {
            for (int i = 0; i < c.length - (QuadSide-1); i++) {
                for (int j = 0; j < c[i].length - (QuadSide-1); j++) {
                    QuadSumTemp = 0;
                    for (int i1 = i; i1 < i+QuadSide; i1++) {
                        for (int j1 = j; j1 < j+QuadSide; j1++) {
                            QuadSumTemp += c[i1][j1];

                        }
                    }
                    if (QuadSumTemp > QuadSum) {
                        QuadSum = QuadSumTemp;
                        QuadSideMax = QuadSide;
                    }

                }

            }
            QuadSide++;

        }
        //System.out.println("Сторона квадрата с наибольшей суммой элементов:" + QuadSideMax);
        //System.out.println("Сумма элементов этого квадрата:" + QuadSum);
        //return c;


    }
    public int [][] RandomArray(int h, int w) {
        int [][] c;
        c = new int [h][w];
        Random r = new Random(System.currentTimeMillis());
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {

                int x = r.nextInt(19) - 9;
                ;
                c[i][j] = (int) x;

            }
        }
        return c;
    }

    public int QuadSideMax() {
        return this.QuadSideMax;
    }

    public int QuadSum() {
        return this.QuadSum;
    }



}

