import java.util.Scanner;


public class Projectfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    
		 System.out.print("월을 입력하시오");
		 int x = sc.nextInt();
		 int y;
		 
		 switch(x) {
		 case 2:
			 y = 29; break;
		 case 4:
		 case 6:
		 case 9: 
		 case 11:
			 y = 30; break;
		 default:
		 	y = 31; break;
		 }	
		System.out.print(y);
		
		
		
		
	}

}
