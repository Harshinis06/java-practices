import java.util.Scanner;
class Bill
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int un=s.nextInt();
		double p=s.nextDouble();
		int n3,u1=0;
		if(un>200){
			 
			int u=un-100;
			System.out.println("1st 100 units");
			 u1=u1+(100*3);
          System.out.println(u1);

			int n1=u-50;
			System.out.println("next 50 units");
			 u1=u1+(50*5);
         System.out.println(u1);
                                
			int ne1=n1-50;
			System.out.println("2nd 50 units");
			u1=u1+(50*7);
			System.out.println(u1);

             
	     // System.out.println("current electric amount"+u1);
      
	  if(p>=0){
		  p=(10*p/100);
		  double bill=p+u1;
				System.out.println("pending amount"+p+"+"+"current electric bill"+u1+"="+bill);
	     if(ne1>200){
		System.out.println("above 200 units");
	     n3=200*11;
		 double total=bill+n3;
		  System.out.println("with above 200 unites"+n3+"=>"+"total elactric bill"+"="+total);
		 	 
			
		}
		    }
			
		
	}
	else{
	if(p>0){
		 p=(10*p/100);
		 System.out.println("your pending amount is"+p);
		 System.out.println("if below 200 units runs free no need to pay");
	}
	 else{
	System.out.println("thare is no pending amount");
	System.out.println("if below 200 units runs free no need to pay");
	}
	
       }
}
}

		
	/*	else if(u1>200){
		System.out.println("above 200 units");
	     n3=200*11;
		  total=u1+n2+ne2+n3;*/
		
		/*
		else if(p<0){
			 total=u1+n2+ne2+n3;
			int bill=(p*10/100)+total;
				System.out.println(bill);
		}*/
	
   	

