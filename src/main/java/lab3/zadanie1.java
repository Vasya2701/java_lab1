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

public static void main (String[] args) {
double n = -6;
double b=3;
double drob = 1;
double result = 3;
int x;
if (n > 0)
{
   x = (int) n;
   for (int i=0; i<n; i++) 
   {
       result*=b;
       System.out.println(result);
   } 
   
}
else
{
    x = (int) n;
    for (int i=x; i<0; i++) 
   {
       drob = drob * (1/b);
       
   } 
    System.out.println( drob );
}

}
}
