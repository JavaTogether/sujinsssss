package binary;

public class VariableEx2 {

	public static void main(String[] args) {
		int num = 10; //10을 리터럴이라고 함
		int level = 50; //정수는 4바이트로 저장함
		
		long n = 1234566789000L; //8바이트로 저장하고 싶으면 숫자 끝에 식별자L을 붙이자촘
		
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		int ch2 = 67;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		double dNum = 3.14;
		float fNum = 3.14F; //float은 끝에 F
		
		var test = 3.14; //자료형 추론 -> double test = 3.14;
		
	}

}
