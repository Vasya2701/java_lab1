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
import java.math.BigInteger;
import java.util.ArrayList;
public class zadanie1 {
private static ArrayList <BigInteger> numBox = new ArrayList<>(100);

private static void fillBox(final int pow) {
for (int i = 1; i < 101; i++) {
numBox.add(new BigInteger(i+"").pow(pow));
}
}
private static void printNumsEquFerma(final int pow) {
BigInteger a, b, c;
fillBox(pow);
System.out.printf("Ищем числа для уравнения Ферма степени %d%n", pow);
for (int i = 0; i < numBox.size(); i++) {
a = numBox.get(i);
for (int j = i; j < numBox.size(); j++) {
b = numBox.get(j);
c = a.add(b);
if (numBox.contains(c))
System.out.printf("%d + %d = %d%n", a, b, c);
}
}
numBox.clear();
}
public static void main(String[] args) {
printNumsEquFerma(3);
printNumsEquFerma(3);
printNumsEquFerma(11);
}
}


