package javaSamples.Zinat.bug_EqualsMethodAlwaysReturnsTrue;
/*If a class overrides the default implementation of equality defined by the Object.equals method,
 *and a subclass of that class declares additional fields to the ones that it inherits, the results
 *of equals may be wrong, unless that subclass also redefines equals.
 */
public class Rectangle extends Squar {

	private int height = 0;

	public Rectangle(int width, int height) {
		super(width);
		this.height = height;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(4, 3);
		Rectangle r2 = new Rectangle(4, 5);
		System.out.println(r1.equals(r2)); // Outputs 'true'
	}

}
