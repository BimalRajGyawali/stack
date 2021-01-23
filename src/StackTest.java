

import usages.InfixToPostfixConverter;
import usages.InfixToPrefixConverter;

public class StackTest {
	public static void main(String[] args) {

//		String infixString = "a+(b-c)";
//		String infixString = "a*b+c/d-e*f";
		String infixString = "h/g^(f+e)*d-b+a";
		var converter = new InfixToPostfixConverter(infixString);
		String postfixString = converter.convert();
		System.out.println(postfixString);
		
		System.out.println(new InfixToPrefixConverter(infixString).convert());
	}
}
