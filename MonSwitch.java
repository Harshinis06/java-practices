import java.util.Scanner;
class MonSwitch 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int y=s.nextInt();
		int m=s.nextInt();
		switch(m){
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30days");
			break;
				case 2:
				if(y%400==0 || (y%4==0 && y%100==0)){
                System.out.println("29days");
			}
			else{
				 System.out.println("28days");
			}
			break;
			case 1:
			case 3:
            case 5:
			case 7:
			case 8:
		    case 10:
			case 12:
				System.out.println("31days");
			break;
		   default:

			System.out.println("invalid entry");
			
		    
		}
	}
}
