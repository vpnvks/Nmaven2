package javapract;

public abstract class Employee {
private String empname;
private int paymentphor;

public abstract int calsalary();

public Employee(String empname,int paymentphor) {
this.empname=empname;
this.paymentphor=paymentphor;
}

public String getname() {
	return empname;
}
public void setname(String empname) {
	this.empname=empname;
}

public int getpaymentphor() {
	return paymentphor;
}

public void setpaymentphor(int paymentphor) {
this.paymentphor=paymentphor;	
}


}
