package lambda.expressions;

public class LambdaExpression {

	// basic method to print hello
	public void show() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		// basic way to call show() and print hello will be
		LambdaExpression obj = new LambdaExpression();
		obj.show();

		// Lambda expressions are nothing but to add the benefits of Functional
		// Programming so that the code can be more concise and the number of lines will
		// get reduced.

		// Lambda expressions
		// -without name
		// -without return type
		// -without access modifiers

		// trying to convert out method into lambda expression
		// we need to add -> to make it look like lambda expression
		/*
		 * ()-> { System.out.println("Hello"); };
		 * 
		 * 
		 * If there is only instruction in the code, we can remove the curly parenthesis
		 * 
		 * ()-> System.out.println("Hello");
		 * 
		 * This one is the most concise code for the show method.
		 * 
		 * Note we can not directly use any lambda expression, we have to use Functional
		 * Interface to invoke lambda expressions. Below is an example of working lambda
		 * expression :
		 * 
		 */
		DemoInterface demo = () -> System.out.println("Hello from lambda expression");
		demo.show();

		/*
		 * skip the functional interface part(left side of assignment as of now, it will
		 * be detailed in FI series.)
		 */
	}
}
interface DemoInterface {
	public void show();
}
