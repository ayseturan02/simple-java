/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nesnetabanlikismi;

/**
 *
 * @author ayse0
 */
//takima ait Fenerbahce sınıfını olusturalım 
public class Fenerbahce {
    
      Futbolcu kaleci = new Futbolcu();
      //Futbolcu sınıfından new operatörü ile kaleci nesnesi olusturuyoruz
      
      kaleci.ismi="volkan";
      kaleci.yasi="29";
      
      //futbolcu nesnesinin ismi ve yasi isimli degiskenlerine string ve int degerler atıyoruz

      System.out.println("futbolcunun ismi : " + kaleci.ismi);
      System.out.println("futbolcunun yasi : " + kaleci.yasi);
}


