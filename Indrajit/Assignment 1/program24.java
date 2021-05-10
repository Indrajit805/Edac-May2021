import java.util.Scanner;
class program24
{ 
  public static void main ( String args [ ])
   { 
     int bin_num, bin_num1, rem, quot, dec_num=0, i=1,j;
	 int oct_num[]= new int[100];
     Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a Binary no.  : ");
	 bin_num = sc.nextInt( );
	 bin_num1 = bin_num;
	 
	 while(bin_num>0)
	 {
		 rem= bin_num%10;
		 dec_num=dec_num+rem*i;
		 i=i*2;
		 bin_num=bin_num/10;
	 }
	 i=1;
	 quot =dec_num;
	 while(quot>0)
	 {
		 oct_num[i++]=quot%8;
		 quot=quot/8;
	 }
	 System.out.print("Octal number is : ");
	 for(j=i-1;j>0;j--)
     {    
	   System.out.print(oct_num[j]);
	 }  
	 System.out.println( );
    }
}