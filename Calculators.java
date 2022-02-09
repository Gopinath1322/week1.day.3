package week1.day3;

public class Calculators {
	
public void multipleTwoNumbers(double a,double b) {
	// TODO Auto-generated method stub
double c=a*b;
System.out.println(c);

}
public void divideTwoNumbers(float e, float f) {
	// TODO Auto-generated method stub
float d=e/f;
System.out.println(d);
}
public static void main(String[] args) {
	Calculators sum=new Calculators();
	sum.multipleTwoNumbers(6, 5);
	sum.divideTwoNumbers(30, 5);
}
}
