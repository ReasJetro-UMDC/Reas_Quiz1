/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reas_quiz1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Reas_Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in) ;
        System.out.println("Enter the Elements to Sort: ");
        int size = scn.nextInt();
        
        int Arr[] = new int [size];
        System.out.println("The elements you want to sort: "+ size);
        for (int i = 0; i < size; i++) {
            Arr[i] = scn.nextInt();
            
        }
        for(int number: Arr) {
            System.out.println("the elements are: "+ number);
            
           
           
        }
        Arrays.sort(Arr);
        System.out.println("The Elements in sorted in ascending orders are: ");
            for (int number : Arr) {
                System.out.println(+ number);
        }
        }
        
    }
    
    

