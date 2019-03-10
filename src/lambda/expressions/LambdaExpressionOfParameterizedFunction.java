package lambda.expressions;

interface DemoInterfaceWithAddMethod {
	public void add(int a, int b);
}

class DemoInterfaceWithAddMethodImpl implements DemoInterfaceWithAddMethod{
	@Override
	public void add(int a, int b) {
		System.out.println(a + b);
	}
}

public class LambdaExpressionOfParameterizedFunction {

	public static void main(String[] args) {
		
		// Basic approach will be
		DemoInterfaceWithAddMethod obj = new DemoInterfaceWithAddMethodImpl();
		obj.add(2, 10);

		/*
		 * Now we will first try to convert this method's equivalent lambda expression
		 * 
		 * As we know lambda expression is an anonymous function so removing name,
		 * return type and access modifiers will give us:
		 * 
		 * (int a, int b) -> { System.out.println(a+b);};
		 * 
		 * As there is only one line of code in the method we can eliminate the
		 * parenthesis
		 * 
		 * (int a, int b) -> System.out.println(a+b);
		 * 
		 * 
		 * Now next important point is we do not need to give the type as the compiler
		 * can guess the type automatically, so we can also eliminate the type here
		 * 
		 * (a, b) -> System.out.println(a+b);
		 * 
		 * Yes...this is the most concise lambda expression
		 * 
		 * Now trying to implement it with functional interface :
		 */
		// Lambda expression approach
		DemoInterfaceWithAddMethod demo = (a, b) -> System.out.println(a + b);
		demo.add(2, 10);
	}
}
