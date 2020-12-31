package javaSamples.Zinat.bug_DereferencedEpressionMaybeNull;
/*Dereferencing a null value leads to a NullPointerException.
 *An expression may be implicitly dereferenced if its type is a
 *boxed primitive type, and it occurs in a context in which implicit unboxing occurs.
 */
public class Person {
	Integer id;
	String name;

	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// **************TestApp**************//
	public static void main(String[] args) {
		Person PS = new Person(null, "Zinat");
		int id = PS.getId(); // Autoboxing is prone to NullPointerException

	}

}
