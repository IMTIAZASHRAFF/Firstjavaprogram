package building;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Enter First number and then Operation and then Second number:");
		Calculator1 user = new Calculator1();
	System.out.println("Enter First: " + user.first);
	System.out.println("Enter user Operation: +, -, *, /,   " + user.Operation);
	System.out.println("Enter Second: " +  user.second);
	   user.display();
}
}


	

