package com.greatlearningservice;

import java.util.Scanner;

public class Transaction {


        Scanner scanner = new Scanner(System.in);

        public void checkTarget(int[] arr, int number) {
            do {
                int flag = 0;
                long target;
                System.out.println("Enter the value of target:");
                target = scanner.nextInt();

                long sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                    if (sum >= target) {
                        System.out.println("Target achieved after" + (i + 1) + " transactions.");
                        flag = 1;
                        break;
                    }
                    if (flag == 0)
                        System.out.println("Target is not reached");
                }
            }
            while (number-- != 0) ;


            scanner.close();
        }

    }


