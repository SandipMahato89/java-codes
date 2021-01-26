/*1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17, ...
This series is a mixture of 2 series - all the odd terms in this series form a Fibonacci series and all the even terms are the prime numbers in ascending order.
Write a program to find the Nth term in this series.
The value N is a Positive integer that should be read from STDIN. The Nth term that is calculated by the program should be written to STDOUT. Other than the value of Nth term, no other characters/strings or message should be written to STDOUT.
For example, when N = 14, the 14th term in the series is 17. So only the value 17 should be printed to STDOUT.*/





code 


import java.io.*;
public class series
{
    int max=10000;
    void fibonacci(int n)
    {
        int i,a=0,b=1,c;
        for(i=0;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }
    void prime(int n)
    {
        int i,j,flag,count=0;
        for(i=2;i<=max;i++)
        {
            flag=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                count++;
            if(count==n)
            {
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        int n;
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in =new BufferedReader(read);
        System.out.println("Enter the nth number");
        n=Integer.parseInt(in.readLine());
        series ob=new series();
        if(n%2==0)
        {
            ob.prime(n/2);
        }
        else
        {
            ob.fibonacci(n/2+1);
        }
    }
}
    
            
        

