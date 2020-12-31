package javaSamples.Zinat.bug_OptionalMethod;

import java.util.Optional;
/*
 * This rule raises an issue when a known value-based class is used for
 * synchronization. That includes all the classes in the java.time package
 * except Clock; the date classes for alternate calendars, HijrahDate,
 * JapaneseDate, MinguoDate, ThaiBuddhistDate; And the optional classes:
 * Optional, OptionalDouble, OptionalLong, OptionalInt.
 * Under Java 8 breaking this rule may not actually break your code
 */

public class BugOptional7 {

	public static void main(String[] args) {

		Optional fOpt = doSomething();
		synchronized (Optional.of(fOpt)) { // Noncompliant
			// ...
		}

	}

	private static Optional<BugOptional7> doSomething() {

		return Optional.of(new BugOptional7());
	}

}
