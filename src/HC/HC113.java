package HC;

import java.util.HashMap;
import java.util.Map.Entry;

public class HC113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(1, "Naveen Gera");
		hm.put(2, "Nihal Kumar");
		hm.put(3, "Mohan Kumar");
		hm.put(4, "Rohan Garg");
		System.out.println(hm);
		
		HashMap<Integer,Employees> hm2= new HashMap<Integer,Employees>();
		Employees e1=new Employees(31,"Naveen Gera","IAS Officer");
		Employees e2=new Employees(21,"Mohan Kumar","Deputy Collectory");
		Employees e3=new Employees(35,"Rohan Kirk","Collector");
		hm2.put(1,e1);
		hm2.put(2, e2);
		hm2.put(3, e3);
		System.out.println(hm2);
		for(Entry<Integer, Employees> k:hm2.entrySet()) {
			
			int a = k.getKey();
			Employees ee=k.getValue();
			System.out.println(ee.age + ee.Department + ee.Name);
		}

	}

}
