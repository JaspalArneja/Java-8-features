package lambda.expressions;

interface DemoInterfaceForMethodWithReturn{
	public int squareIt(int n);
}

class DemoInterfaceForMethodWithReturnImpl implements DemoInterfaceForMethodWithReturn{

	@Override
	public int squareIt(int n) {
		return n*n;
	}
	
}
public class LambdaExpressionWithRetuenStatement {

	public static void main(String[] args) {

		// Basic approach will be
		DemoInterfaceForMethodWithReturn obj = new DemoInterfaceForMethodWithReturnImpl();
		System.out.println(obj.squareIt(5));

		/*
		 * Now we try to convert it's equivalent lambda expression
		 *
		 * 1) removing name, return type and access modifier
		 * 
		 * 		(int n) -> { return n*n; }
		 * 
		 * 2) only one instruction is there, so skipping the parenthesis
		 * 
		 * 		(int n) -> return n*n;
		 * 
		 * 3) compiler can guess the type automatically, so eliminate it also
		 * 
		 * 		(n) -> return n*n;
		 * 
		 * 4) If there is only one parameter, we can eliminate those () brackets
		 * too...like this way
		 * 
		 * 		n -> return n*n;
		 * 
		 * 5) Now one more thing when there is only return statement is there we don't
		 * need to write return explicitly, so we can eliminate return statement here.
		 * (But when there are more than one instructions then it is must to write
		 *  return statement.)
		 * 
		 * 		n -> n*n;
		 *  
		 *  This is the most concise lambda expression. Now try to implement it.
		 */
		
		DemoInterfaceForMethodWithReturn demo = n -> n * n;
		System.out.print(demo.squareIt(5));
	}
}
