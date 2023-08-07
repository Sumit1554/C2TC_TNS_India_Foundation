
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



class Employee{
	
	Scanner sc = new Scanner(System.in);
	String name;
	double basicPayment, DA,TA,HRA,PF, Salary; 
	int age, retirementAge = 55;
	
	void getData(){
		
		System.out.println("Entre the name of Employee:  ");
		name = sc.nextLine();
		
		System.out.println("Entre the Basic Payment (4500 to 6500) : ");
		basicPayment = sc.nextDouble();
		
		if(basicPayment < 4500 || basicPayment >6500) {
			System.out.println("Invalid Basic Payment ! ");
			return;
		}
		
		System.out.println("Entre the Age of Employee : ");
		age = sc.nextInt();
		
		if(age< 21 && age> 55) {
			System.out.println("Age should be grater than 21 and less than 55 ! ");
		}
		
		sc.close();
		}
	
	void calculatSalary() {
		
		if(basicPayment < 4500 || basicPayment >6500 || age< 21 ||age>55) {
			return;
		}
		
		DA = 0.01 * basicPayment;
		TA = 0.01 * basicPayment;
		HRA = 0.01 * basicPayment;
		PF = 0.005 * basicPayment;
		
		Salary = basicPayment + DA + HRA + TA - PF;
		
		if (Salary >10000) {
            Salary -= 1000;
        }
       
	}
	
	void printSalarySlip() {
		
		
		if(basicPayment < 4500 || basicPayment >6500 || age< 21 ||age>55) {
			return;
		}
		
		
		int yearsLeft = retirementAge - age;
        LocalDate currentDate = LocalDate.now();
        LocalDate retirementDate = currentDate.plusYears(yearsLeft);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        System.out.println("\n\n*************************************************************************\n");
        
		System.out.println("Bill Date: " + currentDate.format(formatter));
		
		System.out.println("Name of Employee: " + name );
		System.out.println("Basic Pay: " + basicPayment);
		System.out.println("DA : " + DA);
		System.out.println("TA : " + TA);
		System.out.println("PF : " + PF);
		System.out.println("HRA : " + HRA);
		
		System.out.println("Final Computed Salary :" + Salary);
		System.out.println("Retirement Date: " + retirementDate.format(formatter));
		
        
		
		
	}
	
}
public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee Sumit = new Employee();
    
		Sumit.getData();
		Sumit.calculatSalary();
		Sumit.printSalarySlip();
		
		

	}

}
