package javaSamples.Zinat.bug_OptionalMethod;

import java.util.Optional;
/*The static method expects a non-null argument, otherwise a NullPointerExeption is triggered*/

public class BugOptionalMain {

	public static void main(String[] args) {

		String test2 = null;

		BugOptional1 test1 = new BugOptional1("a", Optional.of(test2));

	}

}
