/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ayse0
 */
public class diziler4 {
 
    //metotlar dizilerin elemanların teker teker alabilecekleri gibii diziyi de tamamen argüman olarak alabilirler.
    public static void main(String args[]) {
        
        int[] dizi = {3,5,7,9,11};
        //dizi isminde elemanları int tipinde bir dizi olusturuldu 
        metodDizi(dizi[2]);
    }
    public static void metodDizi(int x){
        //metodDizi isimli bir metot olusturuldu
        System.out.println(x);
    }
}
