/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author ya_vv
 */
public class zadanie3 {
public static void main(String[] args) {
int[] a = { 1, -2, 3, 4, 5, 6, 54, 87, 12, 45, 11, 13, 14, 15, 21, 44, 27, 42, 96, 33 };
double sum = 0;
for (int i = 0; i < a.length; i++) {
sum = sum + a[i];
}
sum = sum / a.length;
System.out.print(sum);
}
}
