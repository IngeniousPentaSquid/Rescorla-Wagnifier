import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double alpha;
		double beta;
		double lamda;
		double sumV;
		int penis;
		
		System.out.println("Enter how many trials: ");
		penis = scanner.nextInt();
		System.out.println("Enter the Alpha (Salience): ");
		alpha = scanner.nextDouble();
		System.out.println("Enter the Beta : ");
		beta = scanner.nextDouble();
		System.out.println("Enter the Lamda (Target Learning): ");
		lamda = scanner.nextDouble();
		System.out.println("Enter the Associative Learning: ");
		sumV = scanner.nextDouble();
		
		RescorlaWagner r = new RescorlaWagner(alpha, beta, lamda, sumV);
		
		for (int i = 0; i < penis; i++) {
			System.out.println("Computed: " + r.computeDeltaV());
		}
	}

}
