import java.util.Scanner;
public class Complexcalci {

	public static void main(String[] args) {
		
		String n1 = getInput("Enter a value 1: ");
		String n2 = getInput("Enter a value 2: ");
		String op = getInput("Select an operation: + - * / ");
		
		double result = 0;
		//using try catch block
		try {
			switch(op) {
			case "+":
				result = addition(n1,n2);
				break;
			case "-":
				result = subtract(n1,n2);
				break;
			case "*":
				result = multiply(n1,n2);
				break;
			case "/":
				result = divide(n1,n2);
				break;
			default:
				System.out.println("Invalid operation");;
				return;
					
			}
			
			System.out.println("Output: " + result);
		}
		// exception is occurred  during Runtime of calculator
		catch(Exception e)
		{
			System.out.println("Number Formatting exception " + e.getMessage());
		}
	}
	
	private static double addition(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 + d2;
	}
	
	private static double subtract(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 - d2;
	}
	
	private static double multiply(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 * d2;
	}
	
	private static double divide(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 / d2;
	}
	
	private static String getInput(String str)
	{
		System.out.print(str);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

}
