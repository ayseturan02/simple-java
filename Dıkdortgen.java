/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nesnetabanlikismi;

/**
 *
 * @author ayse0
 */
public class Dıkdortgen {
    //dikdortgene ait en boy degıskenleronı tanımlayalım
    //sınıf ıcerisinde kullanılan bu bolgeye data alanları da dıyebiliriz
    
    public double en;
    public double boy;
    
   //yeni sınıfımızın islevini dıkdortgenalanı ısımlı metodumuz ile tanımlayalım
    //metodumuz void olmadıgındn yanı geriye deger dondurdugunden return deyimi ile deger dondurelım
    
    
    //sınıfımıza ait yapılandırıcımız yada yapılandırıcı metodumuz
    public Dıkdortgen(double x,double y){
        en=x;
        boy=y;
    }
    
    public double DikdortgenAlani(){
        return en*boy;
    }
}
