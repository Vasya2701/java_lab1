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
import java.util.Scanner;
public class zadanie7 {
    

public static void change_string(String[] array) {
// Проверяем условие для изменения строк
if (array[3] == array[4]) {
array[0] += array[1];
} else {
array[0] += array[2];
}
}
public static void main(String[] args) {
String[] myArrayString = new String[5];
Scanner sc = new Scanner(System.in);
// Заполняем строки с s1 до s5 значением
for (var i = 0; i < myArrayString.length; i++) {
System.out.print("Введите s" + (i + 1) + "строку:");
myArrayString[i] = sc.nextLine();
System.out.println();
}
System.out.print("[ ");
for (var i = 0; i < myArrayString.length; i++)
System.out.print(myArrayString[i] + ", ");
System.out.print("]");
change_string(myArrayString);
System.out.print("\n[ ");
for (var i = 0; i < myArrayString.length; i++)
System.out.print(myArrayString[i] + ", ");
System.out.print("]");
}
}


