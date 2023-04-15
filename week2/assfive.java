import java.util.Scanner;



public class assfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char cont = 'Y';
		
		while(cont == 'Y' || cont == 'y') {

			System.out.print("삼각형의 밑변의 길이를 입력하세요: ");
			double base = sc.nextDouble();
			System.out.print("삼각형의 높이를 입력하세요: ");
			double height = sc.nextDouble();
			
			double area = (base * height) / 2.0;
            area = Math.round(area * 10.0) / 10.0;
            
            System.out.println("삼각형의 넓이는 " + area );
            
            System.out.print("continue? (Y/N): ");
            cont = sc.next().charAt(0);
			
			
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		
	}

}
