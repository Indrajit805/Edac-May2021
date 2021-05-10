import java.util.Scanner;
class program12
{ 
  public static void main ( String args [ ])
   {
     Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a three numbers : ");
	 double i = sc.nextDouble( );
	 double j = sc.nextDouble( );
                  double k = sc.nextDouble( );
	 
	 double l =(i+j+k)/3 ;
     System.out.println("average of 3 no. : " +l);
    }
}