import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("PAR");	
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
    }

}
