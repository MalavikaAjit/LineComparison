import java.util.*;

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
        
        double lengthL1 = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
        System.out.println("Length of Line 1 = " + lengthL1 );
	
        System.out.print("Enter x y conrdinate of source point of line 2, L2 : s1,d1  \n"); 
	int s1 = s.nextInt();
	int d1 = s.nextInt();
 	System.out.print("Enter x y conrdinate of destination point line 2, L2 : s2,d2  \n");
        int s2 = s.nextInt();
   	int d2 = s.nextInt();
         
        double lengthL2 = Math.pow(s2-s1, 2) + Math.pow(d2-d1, 2);
        System.out.println("Length of Line 2 = " + lengthL2 );   
        
        boolean lineMatch=false;
        if(lengthL1 == lengthL2)
             lineMatch=true;

        String message;
        if(lineMatch)
               message = "lengthL1 and lengthL2 are equal";
        else
               message = "lengthL1 and lengthL2 are not equal";

        System.out.println("The length of two line L1 and L2 are "+ lengthL1 + " and " + lengthL2 + message);     

      }

 }
