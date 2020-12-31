package javaSamples.Zinat.bug_DereferencedEpressionMaybeNull;

/*Dereferencing a null value leads to a NullPointerException.
 *An expression may be implicitly dereferenced if its type is a
 *boxed primitive type, and it occurs in a context in which implicit unboxing occurs.
 */

public class DereferencedExpression {

	public static Integer i;

	public static void main(String[] args) {
		DereferencedExpression test = new DereferencedExpression();
		test.doSomething(i);
	}

	private static void doSomething(Integer in) {
	/* Noncompliant; NullPointerException will be thrown
	 * Unboxing in java, at runtime Integer.intValue() is called implicitly to return int
	 */
		int j = in;

	// java unboxing, Integer is passed where int is expected
		doPrimitive(in);
	}

	private static void doPrimitive(int i) {

	}

	void paint(Color color) {
		
		if (color == null) {
			System.out.println("NPE becouse of Null accsess" + color.toString()); // Noncompliant; NullPointerException will
																				// be thrown
			}else {
			System.out.println("Ok to accsess color " + color.toString());
		}
		System.out.println("accsess to color without Nullcheck " + color.toString());
//****Sonderfall durch return Statment >>		
		if (color == null) {
			System.out.println("NPE becouse of Null accsess" + color.toString()); // Noncompliant; NullPointerException will
			return;																// be thrown
			}else {
			System.out.println("Ok to accsess color " + color.toString());
		}
		System.out.println("accsess to color without Nullcheck " + color.toString());
	}

}
