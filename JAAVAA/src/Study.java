
public class Study {
	static {
			System.out.println("CG");
	}
	
	public static void main(String[] args) {
		char c= 'a';
	//double ch = c;
		
	int ch = c; //implicit typecasting
	byte b = (byte)c;
//		//System.out.println("byte" + b);
//		//System.out.println("int"+ch);
	double d = (float)c;  //explicit typecasting
	System.out.println("float"+d);
	int a = 237;
	byte b = (byte)a;	System.out.println("byte" + b);
	int s = b +"2;
		System.out.println(b +2);
	System.out.println("2"+b);
		
		
		
		
		
	}
	
	
}
