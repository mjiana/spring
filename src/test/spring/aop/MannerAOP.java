package test.spring.aop;

public class MannerAOP {

	public void beforeSaying() {
		System.out.println("����� �̸���?");
	}
	public void afterReturnSaying() {
		System.out.println("���� ���̽ó׿�!");
	}
	public void afterSaying() {
		System.out.println("�����մϴ�!!");
	}
}
