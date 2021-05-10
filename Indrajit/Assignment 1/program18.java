import java.util.Scanner;
class program18
{ 
  public static void main ( String args [ ])
   { 
     long binary1, binary2, multiply=0;
     int digit, factor=1; 
	 
     Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter first Binary no.  : ");
	 binary1 = sc.nextLong( );
	 System.out.println("Enter second binary no. : ");
	 binary2 = sc.nextLong( );
	 
	 while(binary2!=0)
	 {
		 digit = (int)(binary2%10);
		 if(digit==1)
		 {
			 binary1=binary1* factor;
			 multiply = binaryproduct((int) binary1,(int) multiply);
		 }
		 else
		 {
			 binary1= binary1* factor;
		 }
		 binary2=binary2/10;
		 factor = 10;
	 }
		 System.out.print("Product of two binary no:   "+ multiply+"\n");
   }
        static int binaryproduct(int binary1, int binary2)
		
		 {
			int i =0, rem=0;
			int[] sum = new int[20];
			int binary_prod_result =0;
		 
		 
	        while(binary1!=0||binary2!=0)
	       {
		    sum[i++]= (binary1%10+binary2%10+rem)%2;
			rem= (binary1%10+binary2%10+rem)/2;
			binary1=binary1/10;
			binary2= binary2/10;
	       }
		   if (rem!=0)
		   {
			   sum[i++]=rem;
		   }
		   --i;
		   while(i>=0)
		   {
			   binary_prod_result=binary_prod_result*10+sum[i--];
		   }
		   
	 return binary_prod_result;
    }
}