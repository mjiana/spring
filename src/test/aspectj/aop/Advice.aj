package test.aspectj.aop;

public aspect Advice {
	
	//포인트컷  적용지점 설정
	pointcut callsay(): call(* GilDong.say(..));
	
	//before advice
	before() : callsay() {
		System.out.println("당신은 누구입니까?");
	}
	
	//after advice
	after() : callsay() {
		System.out.println("알겠습니다.");
	}
	
}
