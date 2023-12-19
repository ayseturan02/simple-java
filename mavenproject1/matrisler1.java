/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ayse0
 */
public class matrisler1 {
    public static void main(String args[]) {
        //dizilerimizi dizi1 ve dizi2 olarak,dizi2 nin boyutunu dizi1 e esit olarak tanımlayalım 
      int [] dizi1={1,2,3,4};
      int [] dizi2= new int[dizi1.length];
      //for döngüsü ile dizi1 i dizi 2 ye kopyalayalım .
      for(int i=0; i<dizi1.length; i++){
          dizi2[i]= dizi1[i];
      }
      //dizi2 nin elemanlarını ekrana yazdıralım 
      for(int i=0; i<dizi2.length; i++){
          System.out.println(dizi2[i] + "\t");
      }
      
    }  
}

