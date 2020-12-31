package javaSamples.Zinat.bug_OptionalMethod;

import java.util.Optional;

public class BugOptional1 {

	private String a;
	private Optional<String> b;

	public BugOptional1(String a, Optional<String> b) {
		this.a = a;
		this.b = b;
	}

	public String a() {
		return a;
	}

	public Optional<String> b() {
		return b;
	}

	public String toString() {
		return "BugOptional1{" + "a=" + a + ", b=" + b + '}';
	}

}
