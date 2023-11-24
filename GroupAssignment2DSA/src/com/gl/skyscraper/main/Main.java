package com.gl.skyscraper.main;
import java.util.Scanner;

import com.gl.skyscraper.service.DivideWork;

public class Main {

	public static void main(String[] args) 
	{
		
		//Enter the maximum floor size
		System.out.println("Enter the total no of floors in the building : ");
		try (Scanner sc = new Scanner(System.in)) 
		{
			int maxFloors = sc.nextInt();
			int[] dayWiseFloors = new int[maxFloors];
			
			//Enter the current floor size day wise
			for (int i = 0; i < maxFloors; i++) 
			{
				System.out.println("Enter the floor size given on day : " + (i + 1));
				int floorSize = sc.nextInt();
				
				
				dayWiseFloors[i] = floorSize;
			}
			DivideWork.service(dayWiseFloors);
		}
	}

}
