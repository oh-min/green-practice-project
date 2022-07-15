  import java.util.Scanner;

public class Main {

		Scanner scan = new Scanner(System.in);

		System.out.print("사과의 총개수를 입력하세요 : ");
		int apple= scan.nextInt();	// 사과 총 개수
		int bucket = 10;			// 하나의 바구니 안에 들어가는 사과 개수

		if((double)apple%bucket!=0) {	// 나머지가 있으면 +1
			System.out.println((apple/bucket)+1);
		}else {	// 나머지가 없으면 +0
			System.out.println(apple/bucket);
		}		

}


