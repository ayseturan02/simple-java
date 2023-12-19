package com.mycompany.mavenproject1;

import  java.util.Scanner;

public class main{
    public static void main(String[] args){
        
       String ifade;
        Scanner tara=new Scanner(System.in);  
        //tara isminde yeni bir scanner nesnesi olusturulmaktadır. 
        ifade=tara.nextLine();
        //nextLine() yöntemi ile klavyeden girilen tüm karakterler ifade isimli degiskenimize aktarılr
        System.out.println("isim ve soyisminiz: " + ifade);
    }
    
}

 