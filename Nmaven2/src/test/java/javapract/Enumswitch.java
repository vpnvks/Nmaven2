package javapract;

public class Enumswitch {

	public String getday(Days day) {
		//Days day1=Days.monday;
		switch(day) {
		case monday:
			return "it is monday today";
		case tuesday:
			return "it is tuesday today";
		default :
			return "any other day";
			
		}
		
	}
}
