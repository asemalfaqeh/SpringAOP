package SpringBeans.application.aop;

import org.springframework.stereotype.Component;

@Component
public class Blender implements IBlender {
	
	/* (non-Javadoc)
	 * @see SpringBeans.application.aop.IBlender#BlenderStart()
	 */
	@Override
	public void BlenderStart() {
		System.out.println("Blender Runing..");
	}
	
}
