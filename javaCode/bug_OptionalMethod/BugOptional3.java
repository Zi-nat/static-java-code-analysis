package javaSamples.Zinat.bug_OptionalMethod;

import java.util.Optional;
/*Never use Optional.get () unless you can show that Optional exists*/

public class BugOptional3 {

	public static void main(String[] args) {

		Optional<String> op = Optional.empty();
		if (!op.isPresent()) {

			System.out.println("op: " + op.get());// contained object is Null

		} else {
			System.out.println("op is an empty Object!");
		}
	}

}
