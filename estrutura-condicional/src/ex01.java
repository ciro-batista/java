import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int num;
		num = sc.nextInt();
		
		if (num >= 0) {
			
			System.out.println("NAO NEGATIVO");
		} 
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();

	}

}
