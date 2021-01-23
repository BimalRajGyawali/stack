

import usages.InfixToPostfixConverter;

public class StackTest {
	public static void main(String[] args) {

//		String infixString = "a+(b-c)";
//		String infixString = "a*b+c/d-e*f";
		String infixString = "a+b-d*(e+f)^g/h";
		var converter = new InfixToPostfixConverter(infixString);
		String postfixString = converter.convert();
		System.out.println(postfixString);
	}
}
