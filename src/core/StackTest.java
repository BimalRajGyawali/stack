package core;

public class StackTest {
	public static void main(String[] args) {
		// Stack of integers
		Stack<Integer> integers = new Stack<>();
		integers.push(34);
		integers.push(37);
		integers.push(40);
		integers.traverse();
		System.out.println(integers.pop());
		integers.traverse();
		
		//Stack of Strings
		Stack<String> names = new Stack<>();
		names.push("Java");
		names.push("Kotlin");
		names.push("Scala");
		names.push("Groovy");
		names.traverse();
	}
}
