import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int d;
		
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		
		int d1 = h1;
		int d2 = h2;
		
		
		
		if (h1 > h2) {
			
				if (h1 <= 12) {
					
					d1 = h1;
				}
				else {
					d1 = 24 - h1;
				}
				
				
				if (h2 <= 12) {
					
					d2 = h2;
				}
				else {
					d2 = 24 - h2;
				}
			
			
		}
		else {
			
			if (h1 <= 12) {
				
				d1 = h1;	
			}
			else {
				d1 = 24 - h1;
			}
			
			
			if (h2 > 12) {
				
				d2 = h2;	
			}
			else {
				d2 = 24 - h2;
			}
			
			
		}
		
		
		
		if (h1 > h2) {
		  d = (d1 + d2);
		}
		else {
		  d = (d2 - d1);
		}
		
		
		System.out.println("O JOGO DUROU "+ d + " HORAS(S)" );
		
	
	}

}
