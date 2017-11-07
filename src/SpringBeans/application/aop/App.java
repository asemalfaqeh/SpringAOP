package SpringBeans.application.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static String path = "SpringBeans/bean.xml";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);

		IBlender blender = (IBlender) context.getBean("blender");
		blender.BlenderStart();
		((IMachine) blender).start();
		IFan fan = (IFan) context.getBean("fan");
		fan.Fans(8);
		((IMachine) fan).start();
		context.close();

	}

}
