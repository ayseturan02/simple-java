/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ayse0
 */
public class diziler {

    //java veri tipleri  ----> ilkel veri tipleri ve referans veri tipleri olmak üzere ikiye ayrılır .
    //Ilkel veri tiplerinin dısındaki tüm veri tipleri referans veri tipine dahil edilir .
    //Ilkel veri tipleri sadece 1 tane veri tutabilirken referans veri tipleri ise nesnelein bellekteki yerlerini tutar .
    
    public static void main(String args[]) {
         
        int [] yeniDizi =new int[10];
        int x;
        for(x=0; x<yeniDizi.length; x++){
            System.out.println("indis " + x+" degeri " + yeniDizi[x]);
        }
    }
}
