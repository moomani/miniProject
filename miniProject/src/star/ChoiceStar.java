package star;

import java.io.*;

public class ChoiceStar {
	
	MakeStar makeStar = new MakeStar();
	
	public String choice(String star, int number) {
		String answer = "";
		
		if(star.equals("A")) {
			makeStar.leftStar(number);
			answer = "leftStar : ";
			
		} else if (star.equals("B")) {
			makeStar.rightStar(number);
			answer = "rightStar : ";
			
		} else if (star.equals("C")) {
			makeStar.treeStar(number);
			answer = "treeStar";
			
		} else {
			answer = "알파벳을 정확히 입력해주세요 !";
		}
		return answer;
		
	}
	
	public void introAlp() throws IOException{
		
		System.out.print("랜덤 알파벳 선택 : A / B / C / 중 입력해주세요 : ");
	}
	
	public void introNum() throws IOException {
		
		System.out.print("숫자를 입력해주세요 : ");
	}
}
