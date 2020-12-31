package javaSamples.Zinat.bug_OptionalMethod;

import java.util.Optional;
/* Trying to access the variable Optional.Empty () value
  * leads to a NoSuchElementExeption. Avoid identity-sensitive
  * Operations for optional cases. This includes reference equality (==),
  * Identity hash-based or synchronization.
 */

public class BugOptional2 {

	public static void main(String[] args) {
		Optional<String> op = Optional.empty();
		if (op == null) { // false, but expected true
			System.out.println("op is a null Obj");
		}

	}

}
