/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author ya_vv
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class zadanie1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введи число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        
        double numb = Double.parseDouble(reader.readLine());
        //Scanner in = new Scanner(System.in);
        //double x = in.nextInt();
        
        String[] words = new String[10];
            for (int j=0;j<10;j++)
            {
                words[0]="Ноль";
                words[1]="Один";
                words[2]="Два";
                words[3]="Три";
                words[4]="Четыре";
                words[5]="Пять";
                words[6]="Шесть";
                words[7]="Семь";
                words[8]="Весемь";
                words[9]="Девять";
            }
             
          
            
            if (numb>=0 || numb<=9)
            {
                
                if ((numb ==  0) || (numb ==  1) || (numb ==  2) || (numb ==  3) || (numb ==  4) || (numb ==  5)  || (numb ==  6) || (numb ==  7) || (numb ==  8) || (numb ==  9) || (numb ==  0)) 
            {
              int num = (int)numb;
            System.out.println(words[num]);
            }
            else 
            {
            System.out.println("От 0 до 9 целым числом");
            }
          }
          else
          {
          System.out.println("от 0 до 9");
          }
    }
          
           
}

        