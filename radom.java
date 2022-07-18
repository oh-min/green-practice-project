// 예외처리를 이용한 임의의 값 맞추기
/*
import java.util.InputMismatchException;
import java.util.Scanner;
*/
import java.util.*; // import 합치기

public class radom {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		// 컴퓨터가 생각한 값(임의의 값)
		int com = (int)(Math.random()*100)+1;
		// System.out.println(com);
		int user=0; // 사용자가 값을 입력
		int cnt=0; // 시도횟수
		// 반복문 시작
		while(true) {
			try{
				cnt++; // 시도 횟수 +1
				System.out.print("1과100 사이의 값을 입력하세요>");
				user=s.nextInt();	
				if(com>user) {	// 컴퓨터가 생각한 값 > 사용자가 입력한 값
					System.out.println("더 큰 수를 입력하세요.");
				}else if(com<user) {	// 컴퓨터가 생각한 값 < 사용자가 입력한 값
					System.out.println("더 작은 수를 입력하세요.");
				}else if(com==user) {	// 컴퓨터가 생각한 값 = 사용자가 입력한 값
					System.out.println("정답!!");
					System.out.println(cnt+"번만에 맞추셧습니다.");
					break;	// 반복문 종료
				}
			} catch(InputMismatchException ime) {
				System.out.println("숫자만 입력할 수 있습니다. 다시 입력해주세요.");
				s.nextLine();	
				continue; // 계속
			}
		}	// 반복문 끝	
	}	
}
