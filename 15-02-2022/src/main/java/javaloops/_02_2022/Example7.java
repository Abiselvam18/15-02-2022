package javaloops._02_2022;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {

    int start, end;
    
    Scanner scanner=new Scanner(System.in);
    
    System.out.println("Enter the starting value:");
    start=scanner.nextInt();
    		
    System.out.println("Enter the ending value:");
    end=scanner.nextInt();
    		
    for(; start<=end; start++)
    {
    	if(start%2==0)
    	{
    		System.out.println(+start);
    	}
    	
    }
    	scanner.close();
	}

}
