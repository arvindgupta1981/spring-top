package au.com.arv.aop;

public class Calculator implements CalculatorIntf{
	public double add(double x1, double x2) throws Exception {
		return x1+x2;
	}
	public double subtract(double x1, double x2) throws Exception {
		return x1-x2;
	}
	public double devide(int x1, int x2) throws Exception {
		return x1/x2;
	}

}
