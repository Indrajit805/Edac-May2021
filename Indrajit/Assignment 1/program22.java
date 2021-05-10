import java.util.Scanner;
class program22
{ 
  public static void main ( String args [ ])
   { 
     long bin_num, dec_num=0,j=1,remainder;
	 
     Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a binary number.  : ");
	 bin_num = sc.nextLong( );
	 
	 
	 while(bin_num!=0)
	 {
		 remainder= bin_num%10;
		 dec_num=dec_num+remainder*j;
		 j=j*2;
		 bin_num = bin_num/10;
	 }
	 
	 System.out.print("Decimal number is : "+dec_num);
	 
    }
}