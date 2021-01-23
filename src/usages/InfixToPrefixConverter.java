package usages;

public class InfixToPrefixConverter {
	private String infixString;
	
	public InfixToPrefixConverter(String infixString) {
		this.infixString = infixString;
	}
	
	public String convert() {
		String reversedInfixString = "";
		
		char[] characters = this.infixString.toCharArray();
		for(int i=characters.length-1; i>=0; i--) {
			char c = characters[i];
			if(c == '(') {
				reversedInfixString += ')';
			}else if(c == ')') {
				reversedInfixString += '(';
			}else {
				reversedInfixString += c;
			}
		}
		String postfixString = new InfixToPostfixConverter(reversedInfixString).convert();
		String prefixString = new StringBuffer(postfixString).reverse().toString();
		return prefixString;
	}

}
