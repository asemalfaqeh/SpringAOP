package SpringBeans.application.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectMachine {
	// Parents Create 
	@DeclareParents(value = "SpringBeans.application.aop.*", defaultImpl = SpringBeans.application.aop.Machine.class)
	private IMachine imachine;

	@Pointcut("within(SpringBeans.application.aop.*)")
	public void AroundAdvice() {
	}

	@Around(value = "AroundAdvice()")
	public void aroundadvice(ProceedingJoinPoint p) {
		System.out.println("Starting....");
		try {
			p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Completed...");
	}

}
