package com.company;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Graph extends JFrame{


    int c1 [][];
    private  JLabel label1=new JLabel("Введите размеры массива случайных чисел ");
    private  JLabel label5=new JLabel("или заполните его самостоятельно");
    private  JLabel label2=new JLabel("или воспользуйтесь данными из файла");
    private  JLabel label3=new JLabel("Высота:");
    private  JLabel label4=new JLabel("Ширина:");
    private JButton task15but= new JButton("Задание 15");
    private JButton task22but= new JButton("Задание 22");
    private JButton GenerateArrayBut= new JButton("Сгенерировать массив");
    private JButton WriteArrayBut= new JButton("Заполнить массив самостоятельно");
    private JButton WriteArrayBut1= new JButton("Заполнить массив");
    private JButton ReadArrayFromFileBut= new JButton("Взять массив из файла");

    private JTextField textfforH=new JTextField("",20);
    private JTextField textfforW=new JTextField("",20);
    private JTable jTable1= new JTable();
    private JTable jTableWrite= new JTable();
    public void graphics(){
        JFrame frame = new JFrame("Лабораторная номер 8");
        frame.setSize(300,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.setVisible(true);
        Var15 var15 = new Var15();
        GenerateArrayBut.addActionListener(new ActionListener() {
                                         public void actionPerformed(ActionEvent e) {

                                             int h = Integer.parseInt(textfforH.getText());
                                             int w = Integer.parseInt(textfforW.getText());
                                             jTable1.setModel(new javax.swing.table.DefaultTableModel(new Integer[h][w],new String[w]));

                                             c1 = var15.RandomArray(h,w);
                                             Integer[][] c = new Integer[c1.length][c1[0].length];
                                             for ( int i = 0; i < c.length; i++ )
                                                 for ( int j = 0; j < c[0].length; j++ )
                                                     c[i][j] = (Integer) c1[i][j];
                                             String[] headers = new String[w];
                                             for(int i = 0; i<w; i++){
                                                 String num = String.valueOf(i);
                                                 headers[i] = num;
                                             }

                                             //Создаем новый контейнер JFrame
                                             JFrame jfrm = new JFrame("Исходный массив");
                                             //Устанавливаем диспетчер компоновки
                                             jfrm.getContentPane().setLayout(new FlowLayout());
                                             //Устанавливаем размер окна
                                             jfrm.setSize(300, 170);
                                             //Устанавливаем завершение программы при закрытии окна
                                             jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                             //Создаем новую таблицу на основе двумерного массива данных и заголовков
                                             //jTable1.setModel(new javax.swing.table.DefaultTableModel(c,headers));*/
                                             jTable1 = new JTable(c, headers);
                                             //panel.add(jTable1);

                                             //Создаем панель прокрутки и включаем в ее состав нашу таблицу
                                             JScrollPane jscrlp = new JScrollPane(jTable1);
                                             //Устаналиваем размеры прокручиваемой области
                                             jTable1.setPreferredScrollableViewportSize(new Dimension(250, 100));
                                             //Добавляем в контейнер нашу панель прокрути и таблицу вместе с ней
                                             jfrm.getContentPane().add(jscrlp);
                                             //Отображаем контейнер
                                             jfrm.setVisible(true);




                                         }

                                     });
        WriteArrayBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int h = Integer.parseInt(textfforH.getText());
                int w = Integer.parseInt(textfforW.getText());
                //jTableWrite.setModel(new javax.swing.table.DefaultTableModel(new Integer[h][w],new String[w]));
                jTableWrite = new JTable(h,w);
                panel.add(jTableWrite);


                panel.add (WriteArrayBut1) ;






                /*/Создаем новый контейнер JFrame
                JFrame jfrm = new JFrame("Исходный массив");
                //Устанавливаем диспетчер компоновки
                jfrm.getContentPane().setLayout(new FlowLayout());
                //Устанавливаем размер окна
                jfrm.setSize(300, 250);
                //Устанавливаем завершение программы при закрытии окна
                jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //Создаем новую таблицу на основе двумерного массива данных и заголовков
                //jTable1.setModel(new javax.swing.table.DefaultTableModel(c,headers));
                JButton WriteArrayBut1= new JButton("Заполнить массив");
                WriteArrayBut1.addActionListener(new ActionListener() {
                                                     public void actionPerformed(ActionEvent e) {
                                                         for ( int i = 0; i < c1.length; i++ )
                                                             for ( int j = 0; j < c1[0].length; j++ )
                                                                 c1[i][j] = Integer.parseInt(jTableWrite.getValueAt(i,j).toString());



                                                     }
                                                 });

                //Создаем панель прокрутки и включаем в ее состав нашу таблицу
                JScrollPane jscrlp = new JScrollPane(jTableWrite);
                //Устаналиваем размеры прокручиваемой области
                jTableWrite.setPreferredScrollableViewportSize(new Dimension(250, 100));
                //Добавляем в контейнер нашу панель прокрути и таблицу вместе с ней
                jfrm.getContentPane().add(jscrlp);
                //Отображаем контейнер
                jfrm.setVisible(true);
                panel.add(jTableWrite);
                jfrm.add (WriteArrayBut1) ;*/




            }

        });
        WriteArrayBut1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int h = Integer.parseInt(textfforH.getText());
                int w = Integer.parseInt(textfforW.getText());
                c1 = new int[h][w];
                for ( int i = 0; i < h; i++ ) {
                    for (int j = 0; j < w; j++) {
                        java.lang.Object ob = jTableWrite.getValueAt(i, j);
                        if (ob != null){
                        Integer temp;
                        temp = Integer.valueOf(String.valueOf(ob));
                        JLabel label1=new JLabel(i+"-я строка"+j+"-й столбец: "+temp);
                        c1[i][j] = temp;}
                        else{
                            c1[i][j] = 0;
                        }
                    }
                }



            }
        });
        task15but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {



                Var15 var15 = new Var15();
                var15.Solution15(c1);
                int QuadSide = var15.QuadSideMax();
                int QuadSum = var15.QuadSum();
                JLabel label1Answer15=new JLabel("Сторона квадрата с макс.суммой:"+ QuadSide);
                JLabel label2Answer15=new JLabel("Сумма элементов этого квадрата:"+ QuadSum);
                panel.add(label1Answer15);
                panel.add(label2Answer15);
                int[][] answer = new int[1][2];
                answer[0][0] = QuadSide;
                answer[0][1] = QuadSum;
                FileWork file = new FileWork();
                file.SetFile(answer, "C:\\Users\\olegf\\IdeaProjects\\Task8 Java\\src\\com\\company\\Out15.txt");




            }

        });
        task22but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {



                Var22 var22 = new Var22();
                var22.Solution22(c1);

                JFrame jfrm = new JFrame("Массив с ответом");
                //Устанавливаем диспетчер компоновки
                jfrm.getContentPane().setLayout(new FlowLayout());
                //Устанавливаем размер окна
                jfrm.setSize(300, 170);
                //Устанавливаем завершение программы при закрытии окна
                jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //Создаем новую таблицу на основе двумерного массива данных и заголовков
                //jTable1.setModel(new javax.swing.table.DefaultTableModel(c,headers));*/
                String[] headers = new String[c1[0].length];
                for(int i = 0; i<c1[0].length; i++){
                    String num = String.valueOf(i);
                    headers[i] = num;
                }
                JTable jTable2= new JTable();
                jTable2.setModel(new javax.swing.table.DefaultTableModel(new Boolean[c1.length][c1[0].length],headers));



                //panel.add(jTable2);
                boolean[][] AnswerArray = var22.GetAnswerArray();
                int[][] AnswerArrayInteger = new int[c1.length][c1[0].length];
                for ( int i = 0; i < c1.length; i++ ) {
                    for (int j = 0; j < c1[0].length; j++) {
                        if (AnswerArray[i][j])
                            AnswerArrayInteger[i][j] = 1;
                        else
                            AnswerArrayInteger[i][j] = 0;


                    }
                }

                for ( int i = 0; i < c1.length; i++ ) {
                    for (int j = 0; j < c1[0].length; j++) {
                        if (AnswerArray[i][j])
                            jTable2.setValueAt(java.lang.Boolean.TRUE,i, j);
                        else
                            jTable2.setValueAt(java.lang.Boolean.FALSE,i, j);


                    }
                }

                //Создаем панель прокрутки и включаем в ее состав нашу таблицу
                JScrollPane jscrlp = new JScrollPane(jTable2);
                //Устаналиваем размеры прокручиваемой области
                jTable2.setPreferredScrollableViewportSize(new Dimension(250, 100));
                //Добавляем в контейнер нашу панель прокрути и таблицу вместе с ней
                jfrm.getContentPane().add(jscrlp);
                //Отображаем контейнер
                jfrm.setVisible(true);

                FileWork file = new FileWork();
                file.SetFile(AnswerArrayInteger, "C:\\Users\\olegf\\IdeaProjects\\Task8 Java\\src\\com\\company\\Out22.txt");




            }

        });
        ReadArrayFromFileBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                FileWork file = new FileWork();
                c1 = file.GetFile("C:\\Users\\olegf\\IdeaProjects\\Task8 Java\\src\\com\\company\\in.txt");

            }

        });



        panel.add(label1);
        panel.add(label5);
        panel.add(label2);
        panel.add(label3);
        panel.add(textfforH);
        panel.add(label4);
        panel.add(textfforW);
        panel.add(task15but);
        panel.add(task22but);
        panel.add(GenerateArrayBut);
        panel.add(WriteArrayBut);
        panel.add(ReadArrayFromFileBut);
        frame.add(panel);
    }
    public Object[][] getTableData (JTable table) {
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) table.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Object[][] tableData = new Object[nRow][nCol];
        for (int i = 0 ; i < nRow ; i++)
            for (int j = 0 ; j < nCol ; j++)
                tableData[i][j] = dtm.getValueAt(i,j);
        return tableData;
    }



}
