/****************************************************************************
 * Given an array in reverse sorted order find and display the index of searched element
 * sample input: 1 2 3 4 5 6 7 8  9 10
 * saerch element : 7
 * sample output : 6

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n = in.nextInt() ;
		int ar[]=new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++){
		    ar[i]=in.nextInt();
		}
		System.out.print("Enter the element to be searched : ");
		int ns=in.nextInt();
		
		int lb=0,ub=n-1,mid=0,f=0;
		
		while(lb<=ub){
		    mid=lb+(ub-lb)/2;
		    if(ar[mid]<ns){
		        ub=mid-1;
		    }
		    if(ar[mid]>ns){
		        lb=mid+1;
		    }
		    if(ar[mid]==ns){
		        f=mid;
		        break;
		    }
		}
		if(f!=0){
		    System.out.println(ns+" is present at index = "+f);
		}
		else{
		    System.out.println("Element is not presnt");
		}
	}
}
