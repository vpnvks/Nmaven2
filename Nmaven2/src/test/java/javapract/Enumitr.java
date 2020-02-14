package javapract;

import java.util.ArrayList;

public class Enumitr {

	public ArrayList<String> iterate(){
		ArrayList<String> obj=new ArrayList<String>();
		Days[] days=Days.values();
		for(Days day1: days) {
			
			obj.add(day1.toString());
		}
		
		return obj;
		
	}
}
