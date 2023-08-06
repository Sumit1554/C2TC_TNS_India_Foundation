import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int choice,num1,num2;
		
		Scanner S = new Scanner(System.in);
		int flag = 1;
		while(flag == 1) {
			
			System.out.println("Entre Your Choice: ");
			System.out.println(" 1. Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");
			choice = S.nextInt();
			
			System.out.println("Entre the First Number: ");
			num1 = S.nextInt();
			
			System.out.println("Entre the Second Number: ");
			num2 = S.nextInt();
			
			switch(choice) {
			case 1:
			{
				int addition = num1 + num2;
				System.out.println("Addition is : ");
				System.out.println(addition);
				break;
			}
			case 2:
			{
				int subtraction = num1 - num2;
				System.out.println("Subtraction is : ");
				System.out.println(subtraction);
				break;
			}
			case 3:
			{
				int multiplication = num1 * num2;
				System.out.println("Multiplication is : ");
				System.out.println(multiplication);
				break;
			}
			case 4:
			{
				int division  = num1 / num2;
				System.out.println("Division is : ");
				System.out.println(division);
				break;
			}
			
			}
			
			System.out.println("You want to continue ? (1/0)");
			flag = S.nextInt();
            
			
		}
		S.close();
	}
}
