import java.util.Scanner;


public class asstwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("100이하의 정수를 입력하시오.");
		
		int x = sc.nextInt();
		
		int y = x;
		for(int i = x + 1; i <= 100; i++) {
			y += i;
		}
		System.out.println(x + "부터 100까지의 합은" + y );
	}

}
