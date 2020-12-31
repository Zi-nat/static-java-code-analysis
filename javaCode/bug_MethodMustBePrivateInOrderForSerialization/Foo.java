package javaSamples.Zinat.bug_MethodMustBePrivateInOrderForSerialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Foo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Compliant, private empty constructor intentionally used to prevent any direct instantiation of a class.
	private Foo() {}
	
	public static void doSomething() {
		Foo f=new Foo();
		
	}
	private void writeObject(ObjectOutputStream s){}  //Compliant, relates to the java serialization mechanism
	
    private void readObject(ObjectInputStream in){}  //Compliant, relates to the java serialization mechanism
}


