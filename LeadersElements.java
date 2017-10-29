import java.util.*;
import java.io.*;

public class LeadersElements{
	
	public static void main(String args[])throws IOException{
	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(input.readLine());
		
		String line= input.readLine();
		
		String str[] = line.trim().split("\\s+");
		
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(str[i]);
		
		}
		
		ArrayList<Integer> ar = maxSumWithNoAdjacent(arr);
		
		for(int j=ar.size()-1;j>=0;j--)
			System.out.print(ar.get(j)+" ");
		
	}
	
	public static ArrayList<Integer> maxSumWithNoAdjacent(int a[]){
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(a[a.length-1]);
		int max=a[a.length-1];
		
		for(int i=a.length-2;i>=0;i--){
				
				if(max<a[i]){
					al.add(a[i]);
					max=a[i];
				}
		}


	return al;
	}
	

	
}