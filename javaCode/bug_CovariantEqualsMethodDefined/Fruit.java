package javaSamples.Zinat.bug_CovariantEqualsMethodDefined;
/*This class defines a covariant version of the equals() method, but inherits the normal
 *equals(Object) method defined in the base java.lang.Object class.Non final classes shouldn't
 *use a hardcoded class name in the equals method because doing so breaks the method for subclasses.
 *Instead, make the comparison dynamic.*/ 


public class Fruit extends Food {

	private Season ripe;

	public Season getRipe() {
		return ripe;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (Fruit.class == obj.getClass()) { // Noncompliant; broken for child classes.
			return ripe.equals(((Fruit) obj).getRipe());
		}
		if (obj instanceof Fruit) { // Noncompliant; broken for child classes
			return ripe.equals(((Fruit) obj).getRipe());
		} else if (obj instanceof Season) { // Noncompliant; symmetry broken for Season class
			// ...
		}
		return false;
	}

}
/* Compliant Solution:
public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (this.getClass() == obj.getClass()) {
      return ripe.equals(((Fruit)obj).getRipe());
    }
    return false;
}
*/

