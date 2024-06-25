/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.kopiluwak;

public class Digitsum {

    public static void main(String[] args) {
        int num=937;
        int sum=0;
        while(num!=0){
            sum=sum+(num%10);
            num=num/10;
        }
        System.out.print(sum);
    }
        
   }

