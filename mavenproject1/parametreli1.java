/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ayse0
 */
public class parametreli1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int birinciSayi = 8 ;
        int ikinciSayi =5;
        
        int mutlakFark = farkiniAl(birinciSayi , ikinciSayi);
        
        System.out.println(birinciSayi + " ve "+ikinciSayi + " in mutlak farkı : "+mutlakFark);
    }
    
    
    public static int farkiniAl (int x , int y){
        int farkiniAl;
        if (x>y){
            farkiniAl = x-y;
        }
        else{
            farkiniAl =y-x; 
    }
        return farkiniAl;     
}    
}
