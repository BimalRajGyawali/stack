package usages;

import core.Stack;

public class InfixToPostfixConverter {
	private Stack<Character> stack;
	private String postFixString;
	private String infixExpression;
	
	public InfixToPostfixConverter(String infixExpression) {
		this.stack = new Stack<Character>(infixExpression.length());
		this.postFixString = "";
		this.infixExpression = infixExpression;
	}

	public String convert() {
		char[] characters = this.infixExpression.toCharArray();
		for (char character : characters) {
			if (character == '(') {
				this.stack.push(character);;
			} else if (character == ')') {
				while (this.stack.peek() != '(') {
					this.postFixString += this.stack.pop();
				}
				this.stack.pop();
			} else if (isOperator(character)) {
				if (this.stack.isEmpty()) {
					this.stack.push(character);
				} else {

					while ( !this.stack.isEmpty() &&
							this.stack.peek() != '(' &&
							!hasLesserPrecedence(this.stack.peek(), character)) {
						this.postFixString += this.stack.pop();
					}
					this.stack.push(character);
				}

			} else {
				this.postFixString += character;
			}
		}
		// when the infix string is scanned, pop all contents of stack to postfix string
		while (!this.stack.isEmpty()) {
			this.postFixString += this.stack.pop();
		}

		return this.postFixString;
	}

	private boolean hasLesserPrecedence(char first, char second) {
		// checks if first operator has lesser precedence
		if ((first == '-' || first == '+') && (second == '*' || second == '/' || second == '^')) {
			return true;
		}
		if ((first == '*' || first == '/') && second == '^') {
			return true;
		}

		return false;
	}

	private boolean isOperator(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
			return true;
		}
		return false;
	}

}
