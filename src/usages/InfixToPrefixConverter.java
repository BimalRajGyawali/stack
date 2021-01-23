package usages;

public class InfixToPrefixConverter {
	private String infixString;
	
	public InfixToPrefixConverter(String infixString) {
		this.infixString = infixString;
	}
	
	public String convert() {
		String reversedInfixString = new StringBuilder(this.infixString).reverse().toString();
		String postfixString = new InfixToPrefixConverter(reversedInfixString).convert();
		String prefixString = new StringBuffer(postfixString).reverse().toString();
		return prefixString;
	}

}
