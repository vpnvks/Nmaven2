package javapract;

public class Contractor extends Employee {
private int hours;

public Contractor(String empname,int paymentphor, int hours) {
super(empname,paymentphor);
	this.hours=hours;
}

	@Override
	public int calsalary() {
		// TODO Auto-generated method stub
		int slary=getpaymentphor()*hours;
		return slary;
	}

}
