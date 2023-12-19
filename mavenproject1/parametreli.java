/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

import static com.mycompany.mavenproject1.parametreli.farkiniAl;

/**
 *
 * @author ayse0
 */
public class parametreli {

    public static void main(String args[]) {
    
    }
    //metot ismi = farkiniAl , dönüs tipi =int, parametreleri int tipindeki x ve y
    public static int farkiniAl (int x, int y){  //public-> erisim belirleyici
        int farkiniAl;
        if (x>y){
            farkiniAl=x-y;
        }
        else{
            farkiniAl=y-x;
        }
        return farkiniAl;   //void de return ile dönüsmez .dönüs degeri olan metotlarda kullanılır
    } //metodun gövde sonu
}

