import java.util.Scanner;
class program11
{ 
  public static void main ( String args [ ])
   {
     Scanner sc = new Scanner (System.in);
	 System.out.println("Enter radius of circle : ");
	 double r = sc.nextDouble( );
	
         
	 
	 double a = 3.142 *r*r ;
	 double p = 2 * 3.142 *r ;
     System.out.println("Area of circle      : " +a);
	 System.out.println("Perimeter of circle : " +p);
    }
}