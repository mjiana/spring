package test.spring.aop;

public class HongGilDong implements Human {

	@Override
	public String sayName(String name) {
		System.out.println(name+"�̶�� �մϴ�.");
		return "�� ���ع�½ ���ع�½ "+name+"�̴�.";
	}

}
