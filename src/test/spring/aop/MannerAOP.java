package test.spring.aop;

public class MannerAOP {

	public void beforeSaying() {
		System.out.println("당신의 이름은?");
	}
	public void afterReturnSaying() {
		System.out.println("멋진 분이시네요!");
	}
	public void afterSaying() {
		System.out.println("존경합니다!!");
	}
}
