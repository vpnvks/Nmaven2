package javaadvance;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> arr=new ArrayList<String>();
arr.add("vipin");
arr.add("vinay");
arr.add("om");
arr.add("atul");
Iterator itr =arr.iterator();
while (itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
