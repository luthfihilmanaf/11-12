/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat4_Percobaan_5;
public class Percobaan_5_Penggunaan_Operator_Logika_dan_Boolean_OR {
    
    public static void main( String[] args ){
int i = 0;
int j = 10;
boolean test = false;

//demonstrasi ||
test = (i < 10) || (j++ > 9);
System.out.println(i);
System.out.println(j);
System.out.println(test);

//demonstrasi |
test = (i < 10) | (j++ > 9);
System.out.println(i);
System.out.println(j);
System.out.println(test);
    }
}
