package infixToProfix;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixEvaluation {

    public static void main(String[] args) {
        String infixExpression = "(2+3*7)";   
        System.out.println("Expression: " + infixExpression);
        System.out.println("Postfix: " + infixToPostfix(infixExpression));
        System.out.println("Result: " + evaluatePostfix(infixToPostfix(infixExpression)));
    }

    public static String infixToPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        char[] input = infixExpression.toCharArray();

        for (char c : input) {
            if (Character.isDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else { 
                while (!stack.isEmpty() && stack.peek() != '(' &&
                        getPrecedence(stack.peek()) >= getPrecedence(c)) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

    public static int evaluatePostfix(String postfix) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int val2 = stack.pop();
                int val1 = stack.pop();
                switch (c) {
                    case '+': stack.push(val1 + val2); break;
                    case '-': stack.push(val1 - val2); break;
                    case '*': stack.push(val1 * val2); break;
                    case '/': stack.push(val1 / val2); break;
                    case '^': stack.push((int)Math.pow(val1, val2)); break;
                }
            }
        }
        return stack.pop();
    }

    private static int getPrecedence(char ch) {
        return switch (ch) {
            case '^' -> 3;
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };
    }
}
