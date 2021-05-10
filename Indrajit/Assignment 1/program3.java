import java.util.Scanner;
class program3
{ 
  public static void main ( String args [ ])
   {
     Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a two numbers : ");
	 int i = sc.nextInt( );
	 int j = sc.nextInt( );
	 
	 int k =i/j;
     System.out.println("division of no. : " +k);
    }
}