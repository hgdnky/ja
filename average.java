package com.gcy.practice;

//import java.util.Scanner;

public class PacticeMakesP {
	
	private static int N = 5;

	public static void main(String[] args) {
		
		double[] Array = new double[N];
		double[] myArray = {1.0,2.0,3.0,4.0,5.0};
		double myresult = getArrayAverage(myArray);
		System.out.println("average of the array is "+ myresult);
				
	}
	
	public static double getArrayAverage(double anArray[]) {
		double sum = 0.0;
		for(int i=0; i < anArray.length; i++)
		{
			sum= sum + anArray[i];
		}
		double average = sum/N;
		return average;
			
		
	}

}
