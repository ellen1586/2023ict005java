import java.util.Scanner;



public class Quiztwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�");
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
