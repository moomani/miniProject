package multiplicationTables;
import java.io.IOException;

public class Calculation {

	public void answer(int num1,int result, int cal) throws IOException {
		if(result == cal) {
			System.out.print("정답입니다~!");
		}else {
			System.out.println("틀렸습니다. 다시공부하세요~!");
			multiplicationTable(num1);
		}
	}
	
	public void multiplicationTable(int num1) throws IOException {
		for(int i = 0; i<20; i++) {
			System.out.println(num1 + "*" + i + "=" + num1*i + "\t");
		}
	}
}
