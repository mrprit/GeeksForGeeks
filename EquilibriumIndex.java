import java.util.*;
import java.io.*;

public class EquilibriumIndex{
	
	
	public static void main(String args[])throws IOException{
	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(input.readLine());
		
		String line= input.readLine();
		
		String str[] = line.trim().split("\\s+");
		
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(str[i]);
		
		}
		
		getEquilibriumIndex(arr);
		
	    
		
	}
	public static void getEquilibriumIndex(int a[]){
		
		int lsum=0;
		int sum=0;
	
		for(int i=0;i<a.length;i++){
		
		sum=sum+a[i];
		}
		
		for(int i=0;i<a.length;i++){
			
			sum=sum-a[i];
			if(lsum==sum){
				System.out.print(i+" ");
			}
			lsum=lsum+a[i];
		}
	}
	
}
