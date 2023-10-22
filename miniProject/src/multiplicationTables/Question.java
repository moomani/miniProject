package multiplicationTables;
import java.io.*;

public class Question {
	
	public static void main(String[] args) throws IOException{
		
		Number n = new Number();
		int num1 = n.getNum1();
		int num2 = n.getNum2();
		int cal = n.cal(num1, num2);
		n.question(num1, num2);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = Integer.parseInt(br.readLine());
		
		Calculation c = new Calculation();
		c.answer(num1,result,cal);
	}
}
