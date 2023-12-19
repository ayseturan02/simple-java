/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ayse0
 */
public class kopyalamaYontemi {

  
    public static void main(String args[]) {
      
        int [] dizi1 ={1,3,3,4};
        int [] dizi2 =new int[dizi1.length];
        //kopyalama islemini arraycopy metodu ile yaparsak;
        System.arraycopy(dizi1, 0, dizi2, 0, 4);
        //dizi1 in ilk elemanı dizi2 nin ilk elemanından baslamak üzere dizi1 in 4 elemanı dizi2 ye kopyalanacak
          //dizi2 yi ekrana yazdıralım
          
          for(int x=0; x<dizi1.length; x++){
              System.out.println(dizi2[x]);
          }
    }
}
