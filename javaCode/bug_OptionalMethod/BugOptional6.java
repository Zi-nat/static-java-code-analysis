package javaSamples.Zinat.bug_OptionalMethod;

import java.io.Serializable;
import java.util.Optional;

public class BugOptional6 implements Serializable {

	/*If you need to serialize an object that contains an optional value,
	 *the Jackson library provides support for treating options as normal objects.
	 */
	private static final long serialVersionUID = 1L;

	private Optional id;

	public Optional getId() {
		return id;
	}

	public void setId(Optional id) { //Noncompliant example
		this.id = id;
	}

}
