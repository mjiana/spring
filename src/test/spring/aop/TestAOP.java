package test.spring.aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bf = new ClassPathXmlApplicationContext(
				new String[] {"test/spring/aop/aopAppContext.xml"} );
		
		Human human = (Human)bf.getBean("hgd");
		System.out.println(human.sayName("ȫ�浿"));
		System.out.println();
		human = (Human)bf.getBean("lss");
		System.out.println(human.sayName("�̼���"));
		System.out.println();
		human = (Human)bf.getBean("ygs");
		System.out.println(human.sayName("������"));
		System.out.println();
	}

}
