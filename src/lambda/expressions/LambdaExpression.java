package lambda.expressions;

interface DemoInterface {
	public void show();
}
class DemoInterfaceImpl implements DemoInterface
{
	@Override
	public void show() {
		System.out.println("Hello");
	}
}
public class LambdaExpression {

	public static void main(String[] args) {

		/*
		 * Basic Approach
		 * 
		 * What if I need to call method show() which is in DemoInterface interface???
		 * 
		 * -> We will write class for the interface DemoInterface.
		 * -> We will override the method show() and give it's implementation.
		 * -> Now to call show() method we will be required to create object of the
		 *    implementation class DemoInterfaceImpl and with that we can call show().
		 */
		DemoInterface obj = new DemoInterfaceImpl();
		obj.show();

		/*
		 * But just to call method show() we wrote one implementation class and and an
		 * overridden method, covering a total of 7 lines just for one single method.
		 * But what if I say that these 7 lines can be reduced to only one line of code
		 * with lambda expressions??? Yes that's the power of lambda expressions.
		 * 
		 * Lambda expressions are nothing but to add the benefits of Functional
		 * Programming so that the code can be more concise and the number of lines will
		 * get reduced.
		 */

		// Lambda expressions
		// -without name
		// -without return type
		// -without access modifiers

		// trying to convert our method into lambda expression
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
		 * We can see that here we don't require any implementation class which saves my
		 * 7 lines of code. My complete code get's covered in one single line. Skip the
		 * functional interface part(left side of assignment as of now, it will be
		 * detailed in FI series.)
		 */
	}
}
