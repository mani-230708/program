package program;
import java.util.InputMismatchException;
import java.util.Scanner;
class Operations extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("add")) {
			Add();
		}
		else if(Thread.currentThread().getName().equals("Print")){
				Print();
	}
		else {
			Bank();
		}
}
	public void Add() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("task 1:Addition operation started");
			System.out.println("enter first number: ");
			int num1=sc.nextInt();
			System.out.println("enter the second number: ");
			int num2=sc.nextInt();
			int res=num1+num2;
			System.out.println("reult is:"+res);
			System.out.println("task 1:addition operation completed");
}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
		catch(InputMismatchException  e2) {
			e2.printStackTrace();
		}
	}
	public void Print() {
		try {
			System.out.println("task 2:printing operation started");
			for(int i=0;i<5;i++)
			{
				System.out.println("GTEC JAINx BANGLORE");
				Thread.sleep(5000);
			}
			System.out.println("task 2:printing operation started");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void Bank() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("task 3: banking operation started");
			System.out.println("enter the account number: ");
			int acc=sc.nextInt();
			System.out.println("enter the pincode: ");
			int pin=sc.nextInt();
			System.out.println("account details recorded");
			System.out.println("task 3:Banking operation completed");
		}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
		catch(InputMismatchException e2) {
			e2.printStackTrace();
		}
	}
}
