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
public class zadanie4 {
    

public static void main(String[] args) {
int строка, столбец, чётные = 0, нечётные = 0;
final int РАЗМЕР_МАССИВА = 10;
int массив[][] = new int[РАЗМЕР_МАССИВА][РАЗМЕР_МАССИВА];
for (строка = 0; строка < РАЗМЕР_МАССИВА; строка++)
{
for (столбец = 0; столбец < РАЗМЕР_МАССИВА; столбец++)
{
массив[строка][столбец] = (строка + 1) + (столбец * 2);
}
}
for (строка = 0; строка < РАЗМЕР_МАССИВА; строка++)
{
for (столбец = 0; столбец < РАЗМЕР_МАССИВА; столбец++)
{
if (столбец / 2 == 0 | строка / 2 == 0)
{
чётные++;
}
else
{
нечётные++;
}
}
}
System.out.println("Чётных: " + чётные + " | " + "Нечётных: " + нечётные);
}
}
