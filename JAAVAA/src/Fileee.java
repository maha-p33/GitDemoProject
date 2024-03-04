import java.io.File;
public class Fileee {
	public static void main(String[] args) {
		String path = "c':\\hello/abc.txt";
		File f = new File(path);
		System.out.println(f.length());
		Fil
		int size = (int)f.length();
		System.out.println(f.length());
		char [] c1= new char[size];
		
		
		
		
		}
		
	}
	


//File f = new File("C:\\hello/abc.txt");
//if(f.exists()!=false)
//{
//	System.out.println("file created");
//	try {
//		f.createNewFile();
//		System.out.println("file succesfully created");
//		
//	}
//	catch(Exception e){
//		e.printStackTrace();
//	}
//}