import java.util.Scanner;
class Marks 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		int sub1=s.nextInt();
		int sub2=s.nextInt();
		int sub3=s.nextInt();
		int sub4=s.nextInt();
		if(sub1>=35 && sub2>=35 && sub3>=35 &&  sub4>=35){
             System.out.println(name+"pass");
			double agg=(sub1+sub2+sub3+sub4)/4;
			System.out.println(agg);
			System.out.println("aggregation"+agg);
			if(agg>90 && agg<=100){
			System.out.println("A"+name);
			}
			else if(agg>70 && agg<=90){
				System.out.println("B"+name);
			}
			else if(agg>50 && agg<=70){
				System.out.println("c"+name);
			}
			else if(agg>35 && agg<=50){
				System.out.println("d"+name);
			}
					else{
						System.out.println("E"+name);
					}
		}
		else{
			 System.out.println(name+"fail");
		}
					
		}                   
		
	
		}


