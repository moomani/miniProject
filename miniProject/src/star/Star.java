package star;
import java.io.*;
public class Star {

	public static void main(String[] args) throws IOException{
		
		MakeStar makeStar = new MakeStar();
		ChoiceStar choiceStar = new ChoiceStar();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		choiceStar.introAlp();
		String star = br.readLine();
		
		choiceStar.introNum();
		int num = Integer.parseInt(br.readLine());
		
		choiceStar.choice(star, num);
		
	}
}
