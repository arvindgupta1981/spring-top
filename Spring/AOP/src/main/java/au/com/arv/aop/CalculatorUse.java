package au.com.arv.aop;

import au.com.arv.configuration.MyBeansUtility;

public class CalculatorUse {
	public static void main(String...k){
		CalculatorIntf cal=(CalculatorIntf)MyBeansUtility.getInstance().getBean("calculatorProxy");
		try {
			System.out.println(cal.add(100,200));
			System.out.println(cal.devide(100,0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
