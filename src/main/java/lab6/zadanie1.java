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
import java.util.Arrays;
import java.util.Random;
public class zadanie1 {
   
public static void main (String[] args) {
Random rand = new Random();
int size = 25;
int[] array = new int[size];
int min = 0;
int max = 0;
int temp;       
for ( int i = 0; i < size; i++ ) {
array[i] = rand.nextInt(100);
if ( array[min] > array[i] ) min = i;
if ( array[max] < array[i] ) max = i;
}
System.out.println(Arrays.toString(array));
System.out.println("Min: "+"array["+min+"]="+array[min]);
System.out.println("Max: "+"array["+max+"]="+array[max]);        
temp = array[min];
array[min] = array[max];
array[max] = temp;        
System.out.println(Arrays.toString(array));
}
}

