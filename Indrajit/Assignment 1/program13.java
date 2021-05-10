import java.util.Scanner;
class program13
{ 
  public static void main ( String args [ ])
   {
     Scanner sc = new Scanner (System.in);
	 System.out.println("Enter length  : ");
	 double l = sc.nextDouble( );
	 System.out.println("Enter breadth : ");
	 double b = sc.nextDouble( );
         
	 
	 double a = l*b ;
	 double p = 2 *(l+b) ;
     System.out.println("Area of rectangle      : " +a);
	 System.out.println("Perimeter of rectangle : " +p);
    }
}