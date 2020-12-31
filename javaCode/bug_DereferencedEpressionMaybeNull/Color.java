package javaSamples.Zinat.bug_DereferencedEpressionMaybeNull;

/*A reference to null should never be dereferenced/accessed. Doing so will cause a NullPointerException to be thrown.
 *At best, such an exception will cause abrupt program termination. At worst, it could expose debugging information
 *that would be useful to an attacker, or it could allow an attacker to bypass security measures.
 * 
 */
public class Color {

	public static Color color;
	String name;

	public Color(String name) {
		this.name = name;
	}

	void paint(Color color) {
		if (color == null) {
			System.out.println("Unable to apply color ");
			color.toString(); // Noncompliant; NullPointerException will be thrown
			return;
		}

	}

	public boolean isNameEmpty() {
		return getName().length() == 0; // Noncompliant; the result of getName() could be null, but isn't null-checked
	}

	private String getName() {
		return this.name;
	}

    //**************TestApp**************//
	public static void main(String[] args) {
		Color Blau = new Color(null);
		Color Green = new Color("green");

		Green.paint(color);// Unable to apply color
//		color.paint(Green); // Exception in thread "main" java.lang.NullPointerException

//		Blau.isNameEmpty(); //Exception in thread "main" java.lang.NullPointerException
	}
}
