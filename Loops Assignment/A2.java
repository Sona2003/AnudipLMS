package com.Loops;

import java.util.Scanner;

public class A2 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner (System.in);

        // Create an array
		int arr[] = new int [10];

		int large = 0, small = Integer.MAX_VALUE;

        // Storing data in array using Scanner
		for (int i = 0; i < arr.length; i++) 
		{

			System.out.print("Enter " + (i+1) + " number: ");

			arr[i] = sc.nextInt();

		}


		System.out.println("The entered numbers are below: ");

		for (int i = 0; i < arr.length; i++) 
		{

			System.out.print(arr[i] + " ");

		}

		System.out.println();

        // Finding largest number from array
		for (int i = 0; i < arr.length; i++) 
		{

			if(large < arr[i]) {

				large = arr[i];

			}

		}
        // Finding Smallest number from array
		for (int i = 0; i < arr.length; i++) {

			if(small > arr[i]) {

				small = arr[i];

			}

		}

		System.out.println("The Largest number of array is: "+ large);

		System.out.println("The Smallest number of array is: "+ small);



	}

}

