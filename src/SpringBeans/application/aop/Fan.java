package SpringBeans.application.aop;

import org.springframework.stereotype.Component;

@Component
public class Fan implements IFan {

	/* (non-Javadoc)
	 * @see SpringBeans.application.aop.IFan#Fans(int)
	 */
	@Override
	public void Fans(int fan) {
		System.out.println("Fans is Found : " + fan);
	}
	
}
