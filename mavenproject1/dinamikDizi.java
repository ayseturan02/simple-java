/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.ArrayList;

/**
 *
 * @author ayse0
 */
public class dinamikDizi {
    public static void main(String args[]) {
        ArrayList <String> dizi = new ArrayList <String>();
                 dizi.add("alp");
                 dizi.add("alper");
                 dizi.add("akalın"); 
                 dizi.add(2,"alperen" );
                 // 2. indise yani araya alperen degerini atıyoruz
                 System.out.println("dizimizin boyutu = " +dizi.size());
                 for(int x=0; x<dizi.size(); x++){
                     System.out.println("indis " + x +  " :  "  + dizi.size() );
                 }
                 dizi.remove(3);
                 System.out.println("3 indisli eleman silindikten sonraki dizi boyutu =" + dizi.size());
                  for(int x=0; x<dizi.size(); x++){
                     System.out.println("indis " + x +  " :  "  + dizi.get(x) );
                 }
  
    }
}
