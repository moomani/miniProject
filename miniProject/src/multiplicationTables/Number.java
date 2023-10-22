package multiplicationTables;

public class Number {
	
	public int getNum1() {
		return (int)(Math.random() * 20) + 1;
	}
	public int getNum2() {
		return (int)(Math.random() * 20) + 1;
	}
	public int cal(int num1, int num2) {
		return num1*num2;
	}
	public void question(int num1, int num2) {
		System.out.println("19단 곱셈퀴즈 시작 !");
		System.out.print(num1+ "*" + num2 + "= ");
	}
}
