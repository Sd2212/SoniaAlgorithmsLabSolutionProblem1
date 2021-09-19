package com.greatlearning;

import com.greatlearningservice.Transaction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception {
        	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of transaction array:");
        int elements=sc.nextInt();
        int a[]=new int[elements];
        System.out.println("Enter the value of array:");
        for (int i=0;i<elements;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the number of targets needs to be achieved");
        int target=sc.nextInt();
        Transaction t=new Transaction();
        t.checkTarget(a,target);
        sc.close();
    }

}
