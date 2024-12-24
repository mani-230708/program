package program;

import java.util.Scanner;

public class stp {
	public static void main(String[] args) throws InterruptedException{
		Scanner sc=new Scanner(System.in);
		System.out.println("task 1:addition operation started");
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("result is:"+res);
		System.out.println("task 1:addition operation completed");
		System.out.println("task 2:printing operation started");
		for(int i=0;i<5;i++) {
			System.out.println("MK");
			Thread.sleep(2000);
		}
		System.out.println("task 2:printing operation completed");
		System.out.println("task 3:banking operation started");
		System.out.println("enter account number");
		int acc=sc.nextInt();
		System.out.println("enter the pincode");
		int pin=sc.nextInt();
		System.out.println("account details recorded");
		System.out.println("task 3:banking operation completed");
	}

}