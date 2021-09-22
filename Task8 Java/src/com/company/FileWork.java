package com.company;
import java.io.*;
import java.util.Scanner;


public class FileWork {

    public void SetFile(int[][]MyArray, String path){

        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(path),false);
            for (int i =0;i<MyArray.length;i++){
                for(int j=0;j<MyArray[0].length;j++){
                    out.print(MyArray[i][j]+" ");
                }
                out.append('\n');
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public int[][] GetFile ( String path){
        int[][] value = null;
        File file = new File(path);
        try {
            Scanner sizeScanner = new Scanner(file);
            String[] temp = sizeScanner.nextLine().split(" ");
            sizeScanner.close();
            int nMatrix = temp.length;

            int count=0;
            Scanner size2scanner = new Scanner(file);
            while(size2scanner.hasNextLine()) {
                size2scanner.nextLine();
                count++;
            }
            size2scanner.close();

            Scanner scanner = new Scanner(file);
            value = new int[count][nMatrix];
            for (int i = 0; i < count; i++) {
                String[] numbers = scanner.nextLine().split(" ");
                for (int j = 0; j < nMatrix; j++) {
                    value[i][j] = Integer.parseInt(numbers[j]);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }


}
