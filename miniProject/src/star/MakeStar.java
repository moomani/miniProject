package star;

public class MakeStar {
	
	public void leftStar(int number) {
		
		for(int i = 0; i < number; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void rightStar(int number) {
		
		for(int i = 0; i < number; i++) {
			//공백 
			for(int j = number; j < i; j--) {
				System.out.print(" ");
			}
			//별 
			for(int k = 0; k <= i; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void treeStar(int number) {
		
		for(int i = 0; i < number; i++) {
			//공백
			for(int j = 1; j < number-i; j++) {
				System.out.print(" ");
			}
			//별
			for(int k = 0; k < (i*2)+1; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
