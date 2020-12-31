package javaSamples.Zinat.bug_DeadStoreDueToSwitchStatement;

/*When the execution is not explicitly terminated at the end of a switch case, it continues
 *to execute the statements of the following case. While this is sometimes intentional,
 *it often is a mistake which leads to unexpected behavior.
 */
public class SwitchBug {
	
	public void respond() {
		
		int myVariable = 0;
		switch (myVariable) {
		
		case 1:
			foo();
			break;
			
		case 2: // Both 'doSomething()' and 'doSomethingElse()' will be executed.
			doSomething();
		case 3: 
			doSomethingElse();
		default:
			
			break;
		}
	}

	private static void doSomethingElse() {
		// TODO Auto-generated method stub

	}

	private static void doSomething() {
		// TODO Auto-generated method stub

	}

	private static void foo() {
		// TODO Auto-generated method stub

	}
}
