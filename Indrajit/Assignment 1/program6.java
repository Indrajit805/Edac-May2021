import java.util.Scanner;
class program6
{ 
  public static void main ( String args [ ])
   {
     Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a two numbers : ");
	 int i = sc.nextInt( );
	 int j = sc.nextInt( );
     
                   System.out.println("Additon           : "+ i +"+"+j            + "="  +(i+j));
	 System.out.println("Subsraction     : " + i +"-"+j            + "=" +(i-j));
	 System.out.println("Multipication  : " + i +"*"+j            + "=" +(i*j));
	 System.out.println("Division           : "  + i +"/"+j            + "="  +(i/j));
	 System.out.println("Modulus          : " + i +"%"+j            + "="   +(i%j));
    }
}