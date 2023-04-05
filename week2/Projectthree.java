import java.util.Scanner;



public class Projectthree {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    
		 System.out.print("번호를 입력하시오.");
		 int x = sc.nextInt();
		 String y;
		 
		 switch(x) { 
		 
		 case 1:
			 y = "dog";  break;
		 case 2:
			 y = "cat";	 break;	
		 case 3:
			 y = "chick"; break;
		default:
			 y = "i don't know"; break;
		 }
		 System.out.print(y);
		
		
		
		
		
	}

}
