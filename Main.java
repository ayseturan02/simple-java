/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nesnetabanlikismi;

/**
 *
 * @author ayse0
 */
public class Main {
    public static void main(String[] args){
        Dıkdortgen dd1 = new Dıkdortgen(8,10);
        Dıkdortgen dd2 = new Dıkdortgen(9,10);
        
 /*
burada dikdörtgen sınıfına ait nesneler olusturarak , dd1 ve dd2 referanslarının
    nesnemizi refere etmesini saglıyor
        data alanlarımıza gelisi güzel degerler atayalım 
*/
  
  //      dd1.boy=10;
  //      dd2.boy=20;
        
        //islevi metodu cagırıp calıstırlaım
        
        System.out.println("dd1 dıkdortgeninin alanı = " + dd1.DikdortgenAlani());
        System.out.println("dd1 dikdortgenının alanı =" + dd2.DikdortgenAlani());
}
     
}
