package collections;

import java.util.HashMap;

class salary{
	HashMap<String, Integer> empList= new HashMap<>();
	
	public int totalSalary()
	 {
		int total=0;
		for(Integer i: empList.values())
		{
			total+=i;
		}
		
		return total;
		
	}
	public String getSalary(String designation) 
	{
		
		if(empList.containsKey(designation))
		{
			return "Salary is "+empList.get(designation);
		}
		else {
			return "No designation match";
		}
		
	}
	public void updateSalary(String designation,int newSalary) 
	{
	empList.put(designation, newSalary);
	}

}

public class Driver {
	public static void main(String[] args) {
		salary sal = new salary();
		sal.empList.put("ceo", 20000);
		sal.empList.put("developer", 6000);
		
		System.out.println(sal.totalSalary());
		System.out.println(sal.getSalary("ceo"));
		//System.out.println(sal.updateSalary(null, 0));
		
		
		
	}

}
