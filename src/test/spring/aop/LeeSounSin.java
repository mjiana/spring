package test.spring.aop;

public class LeeSounSin implements Human {

	@Override
	public String sayName(String name) {
		System.out.println(name+"�̶�� �մϴ�.");
		return "�� ������ ���� "+name+"�̴�.";
	}

}
