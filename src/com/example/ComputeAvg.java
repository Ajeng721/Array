/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[] score = new int[5];
        
        System.out.println("MASUKKAN ANGKA");
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
    }
        System.out.println();
        
        int total =0;
        
        for (int j = 0; j < score.length; j++) {
            System.out.println(score [j]);
            total = total + score [j];
    }
        System.out.println("Total: ");
        System.out.println(total);
        
        double avg = (double) total / (double) score.length;
        
        
        System.out.println("RATA - RATA ELEMEN DI ATAS ADALAH : " + avg);
    
        
    }
}
        
