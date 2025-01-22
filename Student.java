class  Student 
{
	String name;
	static int a;
	Student(String s,int a){
		name=s;
		this.a=a;
	}
	Student(){}
	           
	void dis(Student n){
		System.out.println(n.a);
	System.out.println(name+" "+a);
	}
	void dis(){
	System.out.println(name+" "+a);
	}
	public static void main(String[] args) 
	{
		Student s1=new Student("ram",56);
		Student s2=new Student();
		s2.dis(s1);
		s1.dis();
	}
}
