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
import java.util.Scanner;
public class zadanie2 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Количество элементов в массиве: ");
int k = in.nextInt();
System.out.println("Максимальный элемент массива: ");
int n = in.nextInt();
int[] numbers = new int[n];
for(int i = 0; i < numbers.length; i++)
numbers[i] = i+1;
int[] result = new int[k];
for(int i = 0; i < result.length; i++) {
int r = (int) (Math.random() * n);
result[i] = numbers[r];
numbers[r] = numbers[n - 1];
n--;
}
Arrays.sort(result);
System.out.print("Отсортированный массив: ");
for(int r : result)
System.out.println(r);
}
}

