import java.util.Scanner;

public class Calculator {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double num1, num2;
	        char operator;
	        
	        System.out.println("Welcome to the Command-line Calculator!");
	        System.out.println("Enter first  Numner: ");
	        num1 = scanner.nextDouble();
	        System.out.println("Enter second Number  Numner: ");
	        num2 = scanner.nextDouble();
	        System.out.println("Enter an operator (+, -, *, /): ");
	        operator = scanner.next().charAt(0);
	        
	        double result;
	        
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error: Division by zero");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operator");
	                return;
	        }
	        
	        System.out.println("Result: " + result);
	        scanner.close();
	    }
	}



