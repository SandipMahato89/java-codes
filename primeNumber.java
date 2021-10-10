import java.util.Scanner;

public class prime
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int flag=0;
		int num=n/2;
		for(int i=2;i<num;i++){
		    if(n%i==0){
		        flag=1;
		        break;
		    }
		}
		if(flag==1){
		    System.out.println(n+" is not a prime number");
		}
		else{
		    System.out.println(n+" is a prime number ");
		}
	}
}
