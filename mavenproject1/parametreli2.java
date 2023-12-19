/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ayse0
 */
public class parametreli2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     int birinciSayi=8;
     int ikinciSayi =5;
     buyukSayiyiEkranaYazdır(birinciSayi, ikinciSayi);
    }
    
    public static void buyukSayiyiEkranaYazdır(int x,int y){
        if(x>y){
            System.out.println("büyük sayi: " + y + " dir");
        }
    }
}
//dönüs degeri olmadıgından return ifadesini de kullanmadık 
//