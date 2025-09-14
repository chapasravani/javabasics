package com.tnsif.first;
import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		System.out.println("Enter your number:");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int temp,rem=0;
		int sum=0;
		temp=n;
		while(n!=0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");

	}

}
