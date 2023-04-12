import java.util.Scanner;



public class Quiztwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < num; i ++) {
			if(i % 5 == 0) {
				sum += i;
			}
			
			
		}
		System.out.println(sum);
		
		
		
		
	}

}
