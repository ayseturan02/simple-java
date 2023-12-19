/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

//ilk olarak paketimize array sınıfını eklememiz gerekmektedir.

import java.util.Arrays;
/**
 *
 * @author ayse0
 */
public class diziSiralama {

    
    public static void main(String args[]) {
        
        int dizi[]={3,8,5,7,6,4};
        Arrays.sort(dizi);
        //dizileri sıralamak için array sınıfının sort metodu kullanılmaktadır
        for(int x=0;  x<dizi.length; x++){
            System.out.println(dizi[x]);
        }
    }
}
