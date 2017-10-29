import java.util.*;
import java.io.*;

public class FindOddOccuringElement{
	
	public static void main(String args[])throws IOException{
	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(input.readLine());
		
		String line= input.readLine();
		
		String str[] = line.trim().split("\\s+");
		
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(str[i]);
		
		}
		
		int oddElement = findOddElement(arr);
		
		System.out.println(oddElement);
		
	}

	public static int findOddElement(int a[]){
		
		int xor=a[0];
		for(int i=1;i<a.length;i++){
			xor^=a[i];
		}
		
	return xor;
	}
}