import java.util.*;
import java.lang.*;

public class LineComparison {
     

     public static void main (String args []){
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner s = new Scanner(System.in);
	System.out.print("Enter x y conrdinate of source point of line 1,L1 : x1,y1  \n"); 
	int x1 = s.nextInt();
	int y1 = s.nextInt();
 	System.out.print("Enter x y conrdinate of destination point line 1,L1 : x2,y2  \n");
        int x2 = s.nextInt();
   	int y2 = s.nextInt();
        
        Double lengthL1 =(double) Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("Length of Line 1 = " + lengthL1 );
	
        System.out.print("Enter x y conrdinate of source point of line 2, L2 : s1,d1  \n"); 
	int s1 = s.nextInt();
	int d1 = s.nextInt();
 	System.out.print("Enter x y conrdinate of destination point line 2, L2 : s2,d2  \n");
        int s2 = s.nextInt();
   	int d2 = s.nextInt();
         
        Double lengthL2 =(double) Math.sqrt( Math.pow(s2-s1, 2) + Math.pow(d2-d1, 2));
        System.out.println("Length of Line 2 = " + lengthL2 );   
        
         int comparison = lengthL1.compareTo( lengthL2);
		switch(comparison){
			case 1:
				System.out.println("Line 1 is greater than Line 2");
				break;
			case 0:
				System.out.println("Line 1 and Line 2 are equal");
				break;
			case -1:
				System.out.println("Line 2 is greaterthan Line 1");
				break;
			default:
				System.out.println("invalid");
				break; 
            } 
         }
      
     }
