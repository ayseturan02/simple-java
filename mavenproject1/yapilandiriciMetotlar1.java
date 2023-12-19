/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ayse0
 */ 
//metot içerisinde  tanımlanan degiskenlere yerel-local degiskenlerde denir
//Metotlarda tanımlanan parametrelerdeki degiskenlerde local degiskenler sınıfına girer ve tüm metot boyunca kullanılabilir.
public class yapilandiriciMetotlar1 {

   //degiskenlerin faaliyet alanı int x ve int y degikenleri tüm metot boyunca kullanılabilir
    public static int farkiniAl(int x,int y) {
            int farkiniAl;
            if(x > y){
                farkiniAl =x - y ;
    }
            else { 
                farkiniAl = y - x ;
            }
            return farkiniAl;
}
}
