/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ayse0
 */
public class matrisler {
  
    public static void main(String args[]) {
     
        int [][] tablo = new int[5][4];
        //iç içe for döngüsü ile dizinin satır ve sütünlarını olusturalım
        for(int satir=0;  satir<tablo.length; satir++){
            for(int sutun=0;  sutun<tablo[satir].length; sutun++){
                //dizimize rastgele sayilar atamak için math sınıfının random metodunu kullanalım
                tablo[satir][sutun]=(int)(Math.random()*100);
            }
        }
        //random metodu 00 ile 1.0 arasında double degerler aldıgından 100 ıle çarpıp yuvarlıyoz
        //bu sekılde yaptıgımız düzenleme sayesınde herhangi bir veri kaybı da yasanmamaktadır.
       
        
        for (int satir=0; satir<tablo.length; satir++){
            for(int sutun=0; sutun<tablo[satir].length; sutun++){
                System.out.println(tablo[satir][sutun] + "  ");
            }
            System.out.println();
        }
    }
}
