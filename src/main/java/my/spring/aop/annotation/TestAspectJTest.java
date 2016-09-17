/*package my.spring.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAspectJTest {
	@Pointcut("execution(* my.spring.aop.annotation.*.test(..))")
	public void test(){
		
	}
	@Before("test()")
	public void beforeTest(){
		System.out.println("****************************");
	}
	@After("test()")
	public void afterTest(){
		System.out.println("--------------------------");
	}
	@Around("test()")
	public Object arountTest(ProceedingJoinPoint p){
		System.out.println("beforel");
		Object obj = null;
		try {
			obj = p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("aftered"+obj);
		return obj;
	}
}
*/