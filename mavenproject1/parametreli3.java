/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ayse0
 */
public class parametreli3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
         int birinciSayi=8;
         int ikinciSayi =5;
         
         int mutlakFark = farkiniAl(birinciSayi ,ikinciSayi);
         System.out.println("birinciSayi = " + birinciSayi);
          //birinciSayi degiskeninin degerini degisip degismedigini kontrol etmek icin ekrana yazıyoruz
          System.out.println(birinciSayi + " ve " +ikinciSayi + " in mutlak farkı : " +mutlakFark);
            //System.out.println("main metot sonu");
    }    
    public static int farkiniAl(int x ,int y){
        //System.out.println("farkınıAl metodu 1");
        int farkiniAl;
        if(x>y){
            farkiniAl=x-y;
        }else {
            farkiniAl=y-x;
        }
        x=13;
       // System.out.printl("farkınıAl metodu 2");
        return farkiniAl;
    }
}
