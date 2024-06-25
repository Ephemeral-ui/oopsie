/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.kopiluwak;
public class Fibonacci {

    public static void main(String args[]) {
        int a=0;
        int b=1;
        int sum=0;
        int n=1;
        System.out.println("First ten elements of fibonacci series are : \n");
        System.out.println(a);
        System.out.println(b);
        while(n<=8){
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);
            n=n+1;
        }
    }
    }

