package javaSamples.Zinat.bug_MethodMustBePrivateInOrderForSerialization;

import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;


/*This class implements the Serializable interface, and defines a method for custom serialization/deserialization.
 *But since that method isn't declared private, it will be silently ignored by the serialization/deserialization API
 */
public class Watermelon implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// ...
	void writeObject(java.io.ObjectOutputStream out)// Noncompliant; not private
			throws IOException {}

	private void readObject(java.io.ObjectInputStream in) {}

	public void readObjectNoData() // Noncompliant; not private
	{}

	static Object readResolve() throws ObjectStreamException {
		return null;
	} // Noncompliant; this method may have any access modifier, may not be static

	Watermelon writeReplace() throws ObjectStreamException {
		return null;
	} // Noncompliant; this method may have any access modifier, but must return Object

}
