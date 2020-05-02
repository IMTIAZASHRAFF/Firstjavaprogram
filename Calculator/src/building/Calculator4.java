package building;

import java.util.Scanner;

public class Calculator4 {
	
	Scanner j = new Scanner(System.in);
	double first = j.nextDouble();
	String Operation = j.next();
	double second = j.nextDouble();

	
	double result;
	
	
    public  void display2() {
    	if ("+" == "+") {
    		result = first + second;
    		System.out.println("Sum: " + result);
    	}
    	else if ("-" == "-") {
    		result = first - second;
    		System.out.println("Sum: " + result);
    	}
    	else if ("*" == "*") {
    		result = first * second;
    		System.out.println("Sum: " + result);
    	}
    	else if ("+" ==  "+") {
    		result = first + second;
    		System.out.println("Sum: " + result);
    	}
    	else if ("/" ==  "/") {
    		result = first / second;
    		System.out.println("Sum: " + result);
    	}
    	else {
    		System.out.println("Defult");
    	}
}
}