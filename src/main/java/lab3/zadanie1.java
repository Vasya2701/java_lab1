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
public class zadanie1 {
 
static int b=3;
static void stepen (int n) {
int result =1;
for (int i=0; i<n; i++) {
result*=b;
}
System.out.println(result);
}
public static void main (String[] args) {
stepen (3);
}
}


