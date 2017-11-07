package SpringBeans.application.aop;

import org.springframework.stereotype.Component;

@Component
public class Machine implements IMachine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Machine is Runing...");
	}
}
