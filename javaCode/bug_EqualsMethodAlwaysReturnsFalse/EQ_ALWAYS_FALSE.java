package javaSamples.Zinat.bug_EqualsMethodAlwaysReturnsFalse;
/*This class defines an equals method that always returns false. This means that an object is not equal to itself,
 *and it is impossible to create useful Maps or Sets of this class. More fundamentally, it means that equals is not
 *reflexive, one of the requirements of the equals method. The likely intended semantics are object identity:
 *that an object is equal to itself. This is the behaviour inherited from class Object . If you need to override
 *an equals inherited from a different super-class, you can use:  
 * public boolean equals(Object o) { 
 * return this == o;
 * } 
 */
public class EQ_ALWAYS_FALSE {
	private int i;

	public static void main(String args[]) {
		int i = 1;
		EQ_ALWAYS_FALSE x = new EQ_ALWAYS_FALSE(i);
		System.out.println("x: " + x.equals(x));
	}

	public EQ_ALWAYS_FALSE(int i) {

		this.i = i;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	public boolean equals(Object obj) {
		if (obj != this) //Good: if (this == obj)
			return true;
		if (this != obj) //Good: if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EQ_ALWAYS_FALSE other = (EQ_ALWAYS_FALSE) obj;
		if (i != other.i)
			return false;
		return false; //return true;
	}

}
