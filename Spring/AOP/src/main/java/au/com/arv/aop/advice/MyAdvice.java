package au.com.arv.aop.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.util.StopWatch;

public class MyAdvice implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice, MethodInterceptor {
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("befor:method:"+method.getName());
		System.out.println("befor:object:"+args.toString());
		System.out.println("befor:target:"+target.getClass().getName());
	}
	@Override
	public void afterReturning(Object returnObj, Method method, Object[] args,
			Object target) throws Throwable {
		System.out.println("after:method:"+returnObj.getClass().getName());
		System.out.println("after:method:"+method.getName());
		System.out.println("after:object:"+args.toString());
		System.out.println("after:target:"+target.getClass().getName());
	}
	
	public void afterThrowing(Method m,Object args,Object target, Throwable throwable) {
		System.out.println("throw advice::"+throwable.getMessage());
	}
	
	@Override //work like a profilier
	public Object invoke(MethodInvocation method) throws Throwable {
		
		Object obj; //Return type of the object
		StopWatch stopWatch=new StopWatch();
		System.out.println("Before Method Execution:::"+method.getMethod().getName());
		stopWatch.start(method.getMethod().getName());
		obj=method.proceed();
		stopWatch.stop();
		System.out.println(stopWatch.getTotalTimeMillis()+"MilliSeconds");
		System.out.println("After Method Execution:::"+obj.getClass().getName());
		return obj;
	}		
}//end