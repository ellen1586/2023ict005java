import java.util.Scanner;


public class Projecttwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	    
		 System.out.print("���� �빮�ڸ� �Է��Ͻÿ�.");
		 String x = sc.next();
		 String y;
		 
		 switch(x){
			 case "A": 
				 		y = "Excellent"; break;
			 case "B":
				 		y = "Good";		break;
			 case "C":
				 		y ="Usually";	break;
			 case "D":
				 		y = "Effort";	break;
			 case "F":
				 		y ="Failure";	break;
			default:    y = "error";	break;
		 }
		 System.out.println(x + "�̸�" + y );
		 
		 }
			 
		 
		 
	        
	    
		
		
		
		
		
		
	}


