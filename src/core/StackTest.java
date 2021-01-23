package core;

import usages.InfixToPostfixConverter;

public class StackTest {
	public static void main(String[] args) {

		var converter = new InfixToPostfixConverter();
//		String infixString = "a+(b-c)";
//		String infixString = "a*b+c/d-e*f";
		String infixString = "a+b-d*(e+f)^g/h";
		String postfixString = converter.convert(infixString);
		System.out.println(postfixString);
	}
}
