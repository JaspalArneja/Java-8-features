package lambda.expressions;

interface DemoInterfaceWithSquareMethod {
	public void squareIt(int n);
}

class DemoInterfaceWithSquareMethodImpl implements DemoInterfaceWithSquareMethod{
	@Override
	public void squareIt(int n) {
		System.out.println(n * n);
	}
}
public class LambdaWithOnlyOneParameter {

	public static void main(String[] args) {

		// Basic approach will be
		DemoInterfaceWithSquareMethod obj = new DemoInterfaceWithSquareMethodImpl();
		obj.squareIt(5);

		/*
		 * Now we try to convert it's equivalent lambda expression
		 *
		 * 1) removing name, return type and access modifier
		 * 
		 * 		(int n) -> {System.out.println(n*n);}
		 * 
		 * 2) only one instruction is there, so skipping the parenthesis
		 * 
		 * 		(int n) -> System.out.println(n*n);
		 * 
		 * 3) compiler can guess the type automatically, so eliminate it also
		 * 
		 * 		(n) -> System.out.println(n*n);
		 * 
		 * 4) Now one more thing, If there is only one parameter, we can eliminate those
		 *    () brackets too...like this way
		 * 
		 * 		n -> System.out.println(n*n);
		 * 
		 * This is the most concise lambda expression. Now try to implement it.
		 */
		
		DemoInterfaceWithSquareMethod demo = n -> System.out.println(n * n);
		demo.squareIt(5);
	}
}
