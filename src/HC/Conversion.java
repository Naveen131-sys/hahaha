package HC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//import com.sun.tools.javac.util.List;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Conversion of Hashmap into ArrayList 	
		HashMap<String, Integer> hm=new HashMap<String,Integer>();
		hm.put("Naveen Gera", 56000);
		hm.put("Kirk Swanson", 76000);
		hm.put("Amar Hatson", 96000);
		//Normal printing of Values
		System.out.println(hm);
	
		
		for(Entry<String, Integer> ii:hm.entrySet()) {
			String i=ii.getKey();
			int j=ii.getValue();
			System.out.println("The Value of Key is" + i + "The final value is" + j);
			
		}
		
		java.util.List<String> li=new ArrayList<String>(hm.keySet());
		System.out.println(li);
		for(String a: li) {
			System.out.println(a);
			
		}
		
		
		List<Integer> li1=new ArrayList<Integer>(hm.values());
		System.out.println(li1);
		for(int i:li1) {
			System.out.println(i);
		}

	}

}
