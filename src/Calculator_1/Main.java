package Calculator_1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		float number_1;
		float number_2;
		int is_more=1;
		int option=1111;
		System.out.println("Hello ... ");
		Scanner input = new Scanner(System.in);
		while (is_more>0) {
			option=0;
			while ((option<1) || (option>4)) {
				System.out.println("What Do you want to do ? ");
				System.out.println("Press num 1 for sum ");
				System.out.println("Press num 2 for diff ");
				System.out.println("Press num 3 for multy ");
				System.out.println("Press num 4 for div \n\n select option >>>");
				option=input.nextInt();
			}
			is_more=0;
			System.out.println("Enter First number :");
			number_1=input.nextInt();
			System.out.println("Enter Secound number :");
			number_2=input.nextInt();
			System.out.println("=========================\n");
			if (option==1) {
				System.out.println(" Answer is "+(number_1+number_2));
			}
			else if (option==2) {
				System.out.println(" Answer is "+(number_1-number_2));
			}
			else if (option==3) {
				System.out.println(" Answer is "+(number_1*number_2));
			}
			else if (option==4){
				System.out.println(" Answer is "+(number_1/number_2));
			}
			else {
				System.out.println("Invalid calculation option");
			}
			System.out.println("=========================\n\n");
			System.out.println("Do you have another Calculation ? \n1 to another, 0 to exit :");
			is_more=input.nextInt();
			
		}
		System.out.println(" Application closing... \n Thanks For use");
		input.close();
	}
}
