
//public class Products extends Myntra{
//	String name = "phones";
//	public static void main(String[] args) {
//		Myntra m= new Products();//upcasting
//		//System.out.println(m.MotherName);
//		//Products p = new Myntra();
//		Products p = (Products)m;
//	    System.out.println(p.MotherName);
//	    System.out.println(p.name);
//	    
//		
//	}
//
//}


public class Products extends Myntra{
	String name = "phones";
	public static void main(String[] args) {
		Myntra m= new Products();//upcasting
		//System.out.println(m.MotherName);
		//Products p = new Myntra();
		Products p = (Products)m;
	    System.out.println(p.MotherName);
	    System.out.println(p.name);
	    
		
	}

}
