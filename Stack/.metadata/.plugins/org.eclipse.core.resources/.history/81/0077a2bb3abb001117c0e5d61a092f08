package infixToProfix;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostfix {

	public static void main(String[] args) {
		//String infixExpression = "A+B*C";
		//String infixExpression = "(A+B)*C";
		String infixExpression = "A+B*C-D/E^F";
		System.out.println("Expression: " + infixExpression);
		System.out.println("Coversion Infix to Postfix: " +  infixToPostfix(infixExpression));

	}
	
	public static String infixToPostfix(String infixExpression) {
		
		StringBuilder postfix = new StringBuilder();
		Deque <Character> stack = new ArrayDeque<>();
		
		char [] input = infixExpression.toCharArray();
		
		for (char c : input) {
			if(Character.isLetterOrDigit(c)) {
				postfix.append(c);
			}else if(c == '(') {
				stack.push(c);
			}else if(c == ')') {
				while(!stack.isEmpty() && stack.peek() != '(') {
					postfix.append(stack.pop());
				}
				stack.pop();
			}
			else {
				while(!stack.isEmpty() && stack.peek() != '(' && (getPrecedance(stack.peek()) >= getPrecedance(c))) {
					postfix.append(stack.pop());
				}
				stack.push(c);
			}
		}
		
		
		while(!stack.isEmpty()) {
			postfix.append(stack.pop());
		}
		return postfix.toString();
		
	}




private static int getPrecedance(Character ch) {
	return switch (ch){
		case '^' -> 3;
		case '/' ,'*' -> 2;
		case '+' ,'-' -> 1;
		default -> throw new IllegalArgumentException("Invalid Operator");
	
};
}
}
