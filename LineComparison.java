import java.util.*;
import java.lang.*;

public class LineComparison {
	public static int x1,x2,y1,y2;
	public static Scanner sc=new Scanner(System.in);
	public static void inputCoordinates()
	{
		System.out.println("Enter x co-ordinate for source point1 , x1:");
		x1=sc.nextInt();
		System.out.println("Enter y co-ordinate for source point1 , y1::");
		y1=sc.nextInt();
		System.out.println("Enter x co-ordinate for source point1 , x2:");
		x2=sc.nextInt();
		System.out.println("Enter y co-ordinate for source point1 , y2:");
		y2=sc.nextInt();
	}
	public static double measureLength()
	{
		inputCoordinates();
		double length=Math.sqrt((Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2)));
		System.out.println(" length" + length);
		return length;
	}
	public static void comparison()
	{
		System.out.println("enter line 1 coordinates");
		double lengthL1=measureLength();
		System.out.println("enter line 2 coordinates");
		double lengthL2=measureLength();
		if(lengthL1==lengthL2)
		{
			System.out.println("lengths are equal");
		}
		else
		{
			System.out.println("lengths are not equal");
		}
		int lineMatch=Double.compare(lengthL1, lengthL2);
		if(lineMatch==0)
		{
			System.out.println("lengths are equal");
		}
		if(lineMatch==1)
		{
			System.out.println("Line1 greater than Line2");
		}
		if(lineMatch==-1)
		{
			System.out.println("Line2 greater than Line1");
		}
			
	
	}
	public static void main(String[] args) {
		
		System.out.println("welcome to line comparision computation program!!!");
		LineComparison line =new LineComparison();
		line.comparison();
	}

}