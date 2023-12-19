/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ayse0
 */
public class parametreUcNoktali {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        toplamSayi(3);
        toplamSayi(3,5,7);
        toplamSayi(3,5,7,9,11);
 
    }
    public static void toplamSayi(int ... sayilar ){
        //metodla birlikte verilen degisken sayılar integer olup parametre listesi sayılarıdır
        
        int toplam=0;
        
        for(int Sayi : sayilar){
            toplam += Sayi;
            
            System.out.println("sayilarin toplami :  "  + toplam );
        }
    }
}
