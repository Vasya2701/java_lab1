/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author ya_vv
 */
import java.util.Scanner;
public class zadanie4 {
public static void main(String[] args) {
    double h=10;
    double t=10;
    double G=9.8;
    
    Scanner scan = new Scanner(System.in);
		
    System.out.println("что ищем? высоту(1) или время (2)");
    int x = scan.nextInt();
    if (x == 1){
        System.out.println("введите время");
        t = scan.nextInt();
        h = G * t * t / 2;
    System.out.print("высота в метрах = ");
    System.out.print(h);
    }
    else
    {
    System.out.println("введите высоту");
        h = scan.nextInt();
        t = Math.sqrt(2*h/G);
    System.out.print("время = ");
    System.out.print(t);
    }
}
}

