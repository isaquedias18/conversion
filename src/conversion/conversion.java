package conversion;
import java.util.Locale;
import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.println("Tabela de Conversão de Temperaturas\n");
			System.out.println("(1) Celsius para Fahrenheit\n" + "(2) Fahrenheit para Celsius\n" + "(3) Celsius para Kelvin\n" + "(4) Kelvin para Celsius\n" + "(5) Fahrenheit para Kelvin\n" + "(6) Kelvin para Fahrenheit\n");
			System.out.println("Digite um número");
			int num = sc.nextInt();
			
			//Conversão de Celsius para Fahrenheit
			if(num == 1) {
				System.out.println("Digite a Temperatura em Celsius: ");
				double C = sc.nextDouble();
				double F = C * 1.8 + 32.0;
				System.out.printf("Equivalente em Fahrenheit: %.2f°F", F);
			}
			//Conversão de Fahrenheit para Celsius
			if(num == 2) {
				System.out.println("Digite a Temperatura em Fahrenheit: ");
				double F = sc.nextDouble();
				double C = (F - 32) / 1.8;
				System.out.printf("Equivalente em Celsius: %.2f°C", C);
			}
			//Conversão de Celsius para Kelvin
			if(num == 3) {
				System.out.println("Digite a Temperatura em Celsius: ");
				double C = sc.nextDouble();
				double K = C + 273.15;
				System.out.printf("Equivalente em Kelvin: %.2f°K", K);
			}
			//Conversão de Kelvin para Celsius
			if(num == 4) {
				System.out.println("Digite a Temperatura em Kelvin: ");
				double K = sc.nextDouble();
				double C = K - 273.15;
				System.out.printf("Equivalente em Celsius: %.2f°C", C);
			}
			//Conversão de Fahrenheit para Kelvin
			if(num == 5) {
				System.out.println("Digite a Temperatura em Fahrenheit: ");
				double F = sc.nextDouble();
				double K = ((F - 32) / 1.8) + 273.15;
				System.out.printf("Equivalente em Kelvin: %.2f°K", K);
			}
			//Conversão de Kelvin para Fahrenheit
			if(num == 6) {
				System.out.println("Digite a Temperatura em Kelvin: ");
				double K = sc.nextDouble();
				double F = (K - 273.15) * 1.8 + 32;
				System.out.printf("Equivalente em Fahrenheit: %.2f°F", F);
			}
			
			System.out.println("\n\nDeseja realizar outra conversão (s/n)?");
			resp = sc.next().charAt(0);	
		}
		while(resp != 'n');
		
		sc.close();
	}

}
