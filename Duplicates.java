package com.test;

/*Complete the function below*/

import java.io.*;

public class Duplicates
{
    public static void main(String args[])throws IOException{
	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(input.readLine());
		
		for(int k=0;k<t;k++){
		int n=Integer.parseInt(input.readLine());
		
		String line= input.readLine();
		
		String str[] = line.trim().split("\\s+");
		
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(str[i]);
		
		}
		 
		
		printDuplicates(arr,arr.length);
		
		System.out.println();
		}
	}
      public static void printDuplicates(int a[], int n)
       {
              int count=0;
              int flag=0;
    for(int i=0;i<n;i++){
        if(a[Math.abs(a[i])]==0 && count==0){
            count++;
            continue;
            
        }
        
        
        if(a[Math.abs(a[i])]>0){
            a[Math.abs(a[i])]=-a[Math.abs(a[i])];
           
        }
        else{
            System.out.print(Math.abs(a[i])+" ");
            flag=1; 
        }
        
       }
    if(flag==0)
    	System.out.print("-1");
}
}
