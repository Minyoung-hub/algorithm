package swExpert;

import java.util.Scanner;

public class ArrayGravity {
	static int EMPTY = 0;
	static int BOX = 1;
	
	public static void main(String[] args) {
		int i = 0;
		int testCase = 0, T = 0;
		
		int roomWidth = 0;
		int maxFallen = 0;
		
		int room[][] = new int[100][100];
		int boxTop[] = new int[100];
		
		int cntEmptySpace = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번의 테스트를 실행할지 입력해주세요.\n>> ");
		testCase = sc.nextInt();
		for(T = 0; T < testCase; T++) {
			System.out.print("방의 가로 길이를 입력해주세요.\n>> ");
			roomWidth = sc.nextInt();
			maxFallen = 0;
			
			for(i = 0; i < roomWidth; i++) {
				int n = i+1;
				System.out.print(n+"번째 열에 쌓을 상자의 갯수를 입력해주세요. \n>> ");
				boxTop[i] = sc.nextInt();
				
				for(int j=0; j<boxTop[i]; j++) {
					room[i][j] = BOX;
				}
			}
			for(int k = 0; k<roomWidth; k++) {
				if(boxTop[k] > 0) {
					cntEmptySpace = 0;
					for(int l = k + 1; l < roomWidth; l++) {
						if(room[l][boxTop[k]-1] == EMPTY) {
							cntEmptySpace += 1;
						}
					}
					
					if(cntEmptySpace > maxFallen) {
						maxFallen = cntEmptySpace;
					}
				}
			}
		}
		
		System.out.println("낙차가 가장 큰 값은 " + maxFallen + "입니다.");
		sc.close();
	}
}