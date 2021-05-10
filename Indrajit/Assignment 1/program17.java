import java.util.Scanner;
class program17
{ 
  public static void main ( String args [ ])
   { 
     long binary1, binary2;
     int i=0, rem=0; 
	 int sum[]= new int[20];
     Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter first Binary no.  : ");
	 binary1 = sc.nextLong( );
	 System.out.println("Enter second binary no. : ");
	 binary2 = sc.nextLong( );
	 
	 while(binary1!=0||binary2!=0)
	 {
		 sum[i++]= (int)((binary1 % 10 + binary2 %10 +rem)%2);
		 rem= (int)((binary1 % 10 + binary2 %10 +rem)/2);
		 
		 binary1=binary1/10;
		 binary2=binary2/10;
	 }
		 if(rem!=0)
		 {
			 sum[i++]=rem;
		 }
		 --i;
	 
	 System.out.print("Sum of two binary no.  :");
	 while(i>=0)
	 {
		 System.out.print(sum[i--]);
	 }
	 System.out.println( );
    }
}