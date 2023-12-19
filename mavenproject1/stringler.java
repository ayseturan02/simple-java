/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ayse0
 */
public class stringler {

    public static void main(String args[]) {
        String takim="Fenerbahçe"; 
        //takim isimli string degiskene Fenerbahce ısmını aktarıyoruz
        //length() metodu
        System.out.println("Fenerbahcenın karakter uzunlugu : " +takim.length());
        //charAt(indis) metodu : takım degıskenının indeksi 5 olan karakterini döndürelim.
        System.out.println("indisi 5 olan karakter : " + takim.charAt(5));  //  b
        //Substring(baslangıc-bıtıs indisleri) metodu ,ifadeye baslangıc indisi dahilken bitis indisininki dahil edilmez
        System.out.println(takim.substring(5,9));  // ekrancıktısı:bahc
        System.out.println(" e karakterinin ilk pozisyonu yada indisi : " + takim.indexOf("e"));
        //ekrancıkttısı: e karakterinin ilk pozisyonu yada indisi : 1 
        System.out.println(" e karakterinin i2. indisten sonraki ilk  pozisyonu  : " + takim.indexOf("e",2));
        //ekranCıktısı : e karakterinin 2. indisten sonraki ilk pozisyonu: 3
        //lastindexOf(karakter) metodu
        //string takim ="fenerbahçe"
   
        int son=takim.lastIndexOf("e");
        System.out.println("son : "+ son);  //ekran cıktısı son:9
        //replace(x,y) metodu : yerdegistirme 
        System.out.println("F ile S nın yerleri degistir : " + takim.replace("F","S"));  //senerbahce
        System.out.println("butun harfler buyuk : " + takim.toUpperCase()); // FENERBAHCE
        System.out.println("butun harfler kücük : " + takim.toLowerCase()); //fenerbahce 
        
    }
}
