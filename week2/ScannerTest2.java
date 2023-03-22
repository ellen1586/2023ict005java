import java.util.Scanner;



public class ScannerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		String x = sc.next();
		
		System.out.print("나이를 입력하시오: " );
		int y = sc.nextInt();
		
		
		
		System.out.println(x + "님 안녕하세요! " + y + "이시네요.");
		
	}

}
