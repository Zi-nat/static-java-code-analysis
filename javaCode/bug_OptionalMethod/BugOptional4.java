package javaSamples.Zinat.bug_OptionalMethod;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

public class BugOptional4 {
	private String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BugOptional4 bug = new BugOptional4();
		bug.whenCreateOfNullableOptional_thenOk();

	}

	public void whenCreateOfNullableOptional_thenOk() {

		Optional<String> opt = Optional.ofNullable(name);

		assertEquals("", opt.get());
		/*
		 * Optional.ofNullable () method means that the object can be either Null or
		 * notNull. However, the assertEquals () method throws in exception if the value
		 * is Null.
		 */

	}

}
