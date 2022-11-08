package binary;

public class Constant {

	public static void main(String[] args) {
		
		//상수 : 변하지 않는 값
		final int MAX_NUM = 100;
		final float PI = 3.14F;

		//형변환
		byte bNum = 10;
		int num = bNum;
		
		long lNum = 10;
		float fNum = lNum;
		
		double dNum = fNum+num;
		
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
	}

}
