package building;

import java.util.Scanner;

public  class Calculator1 {


	Scanner i = new Scanner(System.in);
	
	double first = i.nextDouble();
	String Operation = i.next();
	double second = i.nextDouble();

	
	double result;
	
	
 public  void display() {
    	
	switch (Operation) {
	case  "+" :
		result = first + second;
		System.out.println("Sum: " + result);
		break;
	case "-" :
		result = first - second;
		System.out.println("Subtract: " + result);
		break;
	 case"*" :
			result = first * second;
			System.out.println("Multiplication: " + result);
			break;
	 case"/" :
			result = first / second;
			System.out.println("Division: " + result);
			break;
			
			default :
				System.out.println("Default: ");

    
	}
	}
}
