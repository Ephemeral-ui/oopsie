/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.kopiluwak;

public class Reversenum {
    public static void main(String args[]) {
        int n = 94035;
        int rev =0;
        while (n != 0) {

            int rem = n % 10;
            rev=rev*10+rem;
            n/=10;  
}
        System.out.println(rev);
    }
}
