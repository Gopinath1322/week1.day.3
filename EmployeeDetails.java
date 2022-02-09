package week1.day3;

public class EmployeeDetails {
	public void employeeName(String name,int id) {
		// TODO Auto-generated method stub
System.out.println(name+id);
	}
	public void employeeAddress(String address) {
		// TODO Auto-generated method stub
System.out.println(address);
	}
	public void employeeMobileNumber(long mobnum) {
		// TODO Auto-generated method stub
System.out.println(mobnum);
	}
	public static void main(String[] args) {
		EmployeeDetails info=new EmployeeDetails();
				info.employeeName("Gopinath  ",+ 132422);
				info.employeeAddress("dindigu");
				info.employeeMobileNumber(9500339662l);
				
		
				
	}

}
