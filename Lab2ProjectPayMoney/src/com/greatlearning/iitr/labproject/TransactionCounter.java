package com.greatlearning.iitr.labproject;
import java.util.*;
public class TransactionCounter {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of transactions : ");
		
		int noofTransactions = sc.nextInt();
		
		int arr[]= new int[noofTransactions];
		
		System.out.println("Enter the transaction values : ");
		
		for(int i =0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the no of targets to be achieved : ");
		
		int noofTargets= sc.nextInt();
		
		while(noofTargets-- != 0)
		{
			System.out.println("Enter value of target : ");
			long targetValue = sc.nextInt();
			boolean isTargetAchieved= false;
			long sum = 0;
			for(int i=0;i<arr.length;i++)
			{
				sum= sum+arr[i];
				if(sum>=targetValue)
				{
					System.out.println("Target is achieved at " + (i+1));
					isTargetAchieved= true;
					break;
				}
			}
		if(isTargetAchieved== false)
		{
			System.out.println("Your target is not achieved.");
			
		}
		}
		
		sc.close();
	}
}
