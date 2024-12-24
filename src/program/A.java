package program;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[] {10,20,5,70}; 
		int sum=0;
		int small=Integer.MAX_VALUE;
		int large=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(arr[i]>large) {
				large=arr[i];
				
			}
			else if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("Sum "+sum);
		System.out.println("Largest "+large);
		System.out.println("Smallest "+small);
	}

}
