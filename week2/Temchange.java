import java.util.Scanner;


public class Temchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("섭씨 입력:  ");
		double x = sc.nextDouble();
		double y = x * 1.8 + 32;
		System.out.println("변환된 화씨 : " + y);
		
		
		System.out.println("화씨 입력:  ");
		x = sc.nextDouble();
		y = (x -32) / 1.8;
		System.out.println("변환된 섭씨 : " + y);
		
		

	}

}
