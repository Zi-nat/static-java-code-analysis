package javaSamples.Zinat.bug_DereferencedVariableMaybeNull;
/*If a variable is dereferenced, and the variable may have a null value on some
 *execution paths leading to the dereferencing, the dereferencing may result in
 *a NullPointerException.A variable may also be implicitly dereferenced if its type
 *is a boxed primitive type, and the variable occurs in a context in which implicit unboxing
 *occurs. Note that the conditional operator unboxes its second and third operands
 *when one of them is a primitive type and the other is the corresponding boxed type.
 */

import javaSamples.Zinat.bug_DereferencedEpressionMaybeNull.Color;

public class DereferencedVariableMaybeNull {
	
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
		System.out.println("Ok, because this will only excuted if else part of preceding if-statement is executed " + color.toString());
	}
	
}
