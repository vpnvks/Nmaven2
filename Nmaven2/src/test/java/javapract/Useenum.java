package javapract;

import java.util.ArrayList;
import java.util.Iterator;



public class Useenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enumswitch es=new Enumswitch();
		String e1=es.getday(Days.monday);
		System.out.println(e1);
		Enumitr itr1=new Enumitr();
		ArrayList<String> arr=itr1.iterate();
		Iterator<String> istr= arr.iterator();
		while(istr.hasNext()) {
			System.out.println(istr.next());
		}
		
	}

}
