/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class ArrayEx1 {

    public static void main(String args[]) {
        //terdapat kesalahan pada tipe jenis data yaitu tidak sama
       long[] primeNum = new long[20];
       //kurang tanda [] 
        int[] even = new int[5];
        
        
        int[] score = new int [9];
        byte[] values = new byte [10];
        values [0] = 1;
        values [0] = 1;
        values [0] = 1;
        values [0] = 1;
        values [0] = 1;
        values [0] = 1;
        values [0] = 1;
        values [0] = 1;
        values [0] = 1;
        values [0] = 1;
        
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);
    }
}
