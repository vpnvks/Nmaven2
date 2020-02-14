package javapract;

public class Regular extends Employee {

	public Regular(String empname, int paymentphor) {
		super(empname, paymentphor);
		// TODO Auto-generated constructor stub
			}

	@Override
	public int calsalary() {
		// TODO Auto-generated method stub
		int slary=getpaymentphor()*8;
		return slary;
	}
	

}
