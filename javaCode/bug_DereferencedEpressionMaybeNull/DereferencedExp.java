package javaSamples.Zinat.bug_DereferencedEpressionMaybeNull;
/*Dereferencing a null value leads to a NullPointerException.
 *An expression may be implicitly dereferenced if its type is a
 *boxed primitive type, and it occurs in a context in which implicit unboxing occurs.
 */

public class DereferencedExp {

	public static Integer id;

	public void doSomething(Integer in) {
		doPrimitive(in); // Noncompliant; java unboxing, Integer is passed where int is expected		
		int j = in; // Noncompliant; NullPointerException will be thrown

		j = in;
		
		doPrimitive( doPrimitiveWIthIntReturn(in) ); 

		doPrimitive( doPrimitiveWIthINtegerReturn(in) ); 
		
		if (in != null) 
			 j=in; // safe
		else j=in; // unsafe

	}

	public void doPrimitive(int i) {	}

	public int doPrimitiveWIthIntReturn(int i) {	
		return i;
	}
	
	public Integer doPrimitiveWIthINtegerReturn(int i) {	
		return i;
	}
 

	// **************TestApp**************//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DereferencedExp test = new DereferencedExp();
		test.doSomething(id);
		Person PS = new Person(null, "Zinat");
		int id = PS.getId();
	}

}
