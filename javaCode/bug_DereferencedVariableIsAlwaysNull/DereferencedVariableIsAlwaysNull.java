package javaSamples.Zinat.bug_DereferencedVariableIsAlwaysNull;

import java.io.File;
/*If a variable is dereferenced, and the variable has a null value on all possible
 *execution paths leading to the dereferencing, the dereferencing is guaranteed
 *to result in a NullPointerException. A variable may also be implicitly dereferenced
 *if its type is a boxed primitive type, and the variable occurs in a context in which
 *implicit unboxing occurs. Note that the conditional operator unboxes its second and
 *third operands when one of them is a primitive type and the other is the corresponding boxed type. 
 */
public class DereferencedVariableIsAlwaysNull {
	
	private static String str;

	public static void main(String[] args) {

		if (str == null && str.length() == 0) { // Compliant Solution: str == null || str.length() == 0
			System.out.println("String is empty");
		}

		if (str != null || str.length() > 0) {// Compliant Solution: str != null && str.length() > 0
			System.out.println("String is not empty");
		}
	}
	
	

	File dir = new File("new folder");

	public void createDir(File file) {
		if (dir != null || !dir.exists()) { // BAD the condition !dir.exists() is only executed if dir is null
			dir.mkdir();
		}
	}

	/*Compliant Solution: 
	 * public void createDir(File file) { 
	 *     if (dir != null && !dir.exists()) { 
	 *         dir.mkdir(); } 
	 *     }
	 */

}
