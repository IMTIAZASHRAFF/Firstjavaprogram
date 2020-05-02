package building;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner love = new Scanner(System.in);
		System.out.println("Enter First number");
		int first = love.nextInt();
		System.out.println("Enter Second number");
		int second = love.nextInt();
		System.out.println("Enter any Operation, +, -,*,/ ");
		String Operator = love.next();
		int result;
		switch (Operator) {
		case "+" :
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