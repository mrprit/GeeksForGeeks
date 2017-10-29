import java.util.*;
import java.io.*;

public class FlipSubArray{
	
	
	public static void main(String args[])throws IOException{
	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(input.readLine());
		
		String line= input.readLine();
		
		String str[] = line.trim().split("\\s+");
		
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(str[i]);
		
		}
		
		getFlipSubArray(arr);
		
	    
		
	}
	public static void getFlipSubArray(int a[]){
		
		int lsum=0;
		int sum=0;
		int count0=0;
		int count1=0;
		int max=0;
		int s=0;
		int start=0;
		int end=0;
		for(int i=0;i<a.length;i++){
			
				if(a[i]==0){
					count0++;
					if((count0-count1)>0){
						start=s;
					}
					else{
						s=i;
						count1=0;
					}	
					
				}
				else{
					count1++;
					
				}
				
				if((count0-count1)>max){
					max=count0-count1;
					start=s;
					end=i;
				}
		
		}
		System.out.println(start+" "+end);
	}
	
}