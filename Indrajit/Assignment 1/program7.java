import java.util.Scanner;
class program7
{ 
  public static void main ( String args [ ])
   {
     Scanner sc = new Scanner (System.in);
	 System.out.println("Enter numbers : ");
	 int n = sc.nextInt( );
	 
     for(int i=1;i<=10;i++)
     System.out.println(n+ " * " + i + " = " +(n * i));
    }
}