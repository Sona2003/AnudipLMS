package com.Loops;

import java.util.Scanner;

public class A1 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner (System.in);

        //Create an integer array
		int arr[] = new int [5];

		float sum = 0;
        
        // Storing data in array by taking value from user
		for (int i = 0; i < arr.length; i++) 
		{

			System.out.print("Enter " + (i+1) + " number: ");

			arr[i] = sc.nextInt();

		}

        // Doing Summation of Array
		for (int i = 0; i < arr.length; i++) 
		{

			sum = sum + arr[i];

		}

        // Average of Array
		float avg = sum/5;

		System.out.println("The Sum of array are: "+ sum);

		System.out.println("The Average of array are: "+ avg);


	}

}

