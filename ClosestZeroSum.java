import java.util.*;
import java.io.*;

public class ClosestZeroSum{
	
	public static void main(String args[])throws IOException{
	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(input.readLine());
		
		String line= input.readLine();
		
		String str[] = line.trim().split("\\s+");
		
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(str[i]);
		
		}
		
		Arrays.sort(arr);
		
		ArrayList<Integer> ar = getClosestZeroSumEle(arr);
		
		System.out.print(ar.get(0)+" "+ar.get(1));
		
	}
	
	public static ArrayList<Integer> getClosestZeroSumEle(int a[]){
		
		int l=0,r=a.length-1;
		int ele1=0;
		int ele2=0;
		int closest=100000;
		ArrayList<Integer> al =new ArrayList<Integer>();
		
		while(l<r){
				
				if(Math.abs(a[l]-a[r])<closest){
					closest=Math.abs(a[l]-a[r]);
					ele1=l;
					ele2=r;
				}
	
				if(a[l]+a[r]<0){
					l++;
				}
				else
					r--;
				
		}
		al.add(a[ele1]);
		al.add(a[ele2]);

	return al;
	}
	

	
}