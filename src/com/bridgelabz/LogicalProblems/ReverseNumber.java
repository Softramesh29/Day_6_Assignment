package com.bridgelabz.LogicalProblems;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[]){
		int num, x ;
		Scanner scan=new Scanner(System.in);
			System.out.print("Enter the number for find reverse: ");
		num=scan.nextInt();
		do {
			x = num % 10;
			System.out.print(x);
			num = num / 10;
		}while(num>0);
	}
}
