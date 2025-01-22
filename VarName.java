class VarName 
{
	double l=2.34;//instance variable
    static String m="hgfgvk";//static variable
	public static void main(String[] args) 
	{
		float k=9.8f;//local variable
		System.out.println(k) ;
		VarName vn=new VarName();
		System.out.println(vn.l);
		System.out.println(m);
	}
}
