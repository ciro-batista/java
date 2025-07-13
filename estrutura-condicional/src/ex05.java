import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);

		
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();	
		Double vr = null;
		
		
		if (cod == 1) {
			vr = 4.00;
		}
		else if(cod == 2) {
			vr = 4.50;
		}
		else if(cod == 3) {
			vr = 5.00;
		}
		else if(cod == 4) {
			vr = 2.00;
		}
		else if(cod == 5) {
			vr = 1.50;
		}
		
		
		Double Total = (qtd * vr);
		
		sc.close();
		
		System.out.printf("Total: R$ %.2f", Total);
		
		
		
				
				
				

		
		
		
	}

}


