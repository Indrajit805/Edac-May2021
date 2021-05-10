class program14
{
public static void main(String args[])
{
       for(int i=1;i<=16;i++)       //row
	   {        
	          for(int j=1;j<=45;j++)  //column
                                 {    if(j<=8 &&i<=9)
			  {
                                  
			  System.out.print("*");
			  }
                                      else
			  System.out.print("=");
                                 }
                        System.out.println( );                  
                 }
        
                              
}
}