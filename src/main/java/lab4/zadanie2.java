/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author ya_vv
 */
public class zadanie2 {
public static void main(String[] args) {
double s=0;
for ( double x=1; x<100; x++) {
while ( x%2==1 ) {
s=s+1/x;
break;}
}

for ( double n=1; n<100; n++) {
while ( n%2==0 ) {
s=s-1/n;
break;}
}
System.out.println(s);
}
}
    

