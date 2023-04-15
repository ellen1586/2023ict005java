import java.util.Scanner;


public class assfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int num;
		
		do {
		
		System.out.print("정수를 입력하시오(0입력시 종료): ");
		num = sc.nextInt();
		
		if(num % 3 != 0 && num % 5 != 0 && num != 0) {
			x++;
		}
		
		
		}while (num != 0);
		
		System.out.println("3의 배수와 5의 배수를 제외한 수의 개수는" + x );
		
		}
	}


