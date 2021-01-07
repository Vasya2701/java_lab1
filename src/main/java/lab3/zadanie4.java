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
public class zadanie4 {
    public static final Double G=9.8;
public static double vis(double h){
double t= Math.sqrt(2*h/G);
return t;
}
public static void main(String[] args) {
System.out.println(vis(10));
}
}


