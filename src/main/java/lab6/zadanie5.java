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
import java.util.Random;
public class zadanie5 {
public static void main(String[] args) {
Random rand = new Random();
for (var i = 0; i < 3; i++) {
for (var j = 0; j < 5; j++) {
System.out.print(rand.nextInt(10) + " ");
}
System.out.println();
}
}
}


