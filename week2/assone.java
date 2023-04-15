import java.util.Scanner;


public class assone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하세요: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
				sum += i;
				i++;
				
			
		}
		System.out.println("1부터" + n + "까지의 합"  + sum);
		
		
	}

}
