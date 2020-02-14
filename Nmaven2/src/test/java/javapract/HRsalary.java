package javapract;

public class HRsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Contractor cont=new Contractor("mahesh", 300, 7);
Regular reg=new Regular("suresh", 310);
System.out.println(cont.calsalary());
System.out.println(reg.calsalary());
	}

}
