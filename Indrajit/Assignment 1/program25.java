import java.util.Scanner;
class program25
{ 
  public static void main ( String args [ ])
   { 
     long dec_num=0;
	 long oct_num=0;
	 int i=0;
     Scanner sc = new Scanner (System.in);
	 System.out.println("Enter a octal no.  : ");
	 oct_num=sc.nextLong();
	
	 
	 while(oct_num!=0)
	 {
		 dec_num= (long)(dec_num+(oct_num%10)*Math.pow(8,i++));
		 oct_num = oct_num/10;
	 }
	 
	 System.out.print("Decimal number is : "+dec_num);
	 
     
    }
}