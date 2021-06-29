package test.aspectj.aop;

public aspect Advice {
	
	//����Ʈ��  �������� ����
	pointcut callsay(): call(* GilDong.say(..));
	
	//before advice
	before() : callsay() {
		System.out.println("����� �����Դϱ�?");
	}
	
	//after advice
	after() : callsay() {
		System.out.println("�˰ڽ��ϴ�.");
	}
	
}
