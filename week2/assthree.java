import java.util.Scanner;



public class assthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한개의 자연수를 입력하세요: ");
		
		int x = sc.nextInt();
		
		for(int i = 1; i <= 10; i ++) {
			System.out.println(x*i);
		}
		
		
	}

}
