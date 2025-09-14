package com.tnsif.first;

import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int[] digits = new int[20]; 
        int count = 0;
        while (num > 0) {
            digits[count] = num % 10; 
            count++;
            num = num / 10;
        }

        
        boolean isPalindrome = true;
        for (int i = 0; i < count / 2; i++) {
            if (digits[i] != digits[count - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        sc.close();
    }



	}



