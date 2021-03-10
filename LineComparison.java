import java.util.*;

public class LineComparison {
     

     public static void main (String args []){
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner s = new Scanner(System.in);
	System.out.print("Enter x y conrdinate of source point of line 1,L1 : x1,y1  \n"); 
	int x1 = s.nextInt();
	int y1 = s.nextInt();
 	System.out.print("Enter x y conrdinate of destination point of line 1 ,L1 : x2,y2  \n");
        int x2 = s.nextInt();
   	int y2 = s.nextInt();
        
       Double lengthL1 = (double) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("Length of Line 1 = " + lengthL1 );
     }
 
 }
