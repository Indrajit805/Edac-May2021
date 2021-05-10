import java.util.Scanner;
class program19
{ 
  public static void main ( String args [ ])
   { 
     int dec_num, quot, i=1,j;
	 int bin_num[]= new int[100];
     Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a decimal no.  : ");
	 dec_num = sc.nextInt( );
	 quot = dec_num;
	 
	 while(quot!=0)
	 {
		 bin_num[i++]= quot%2;
		 quot = quot/2;
	 }
	 
	 System.out.print("Binary number is : ");
	 for(j=i-1;j>0;j--)
     {    
	   System.out.println(bin_num[j]);
	 }  
	
    }
}