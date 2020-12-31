package javaSamples.Zinat.bug_PossibleInconsistencyDueToInstanceofInEquals;
/*Implementations of 'equals' that use 'instanceof' to test the type of the argument
 *and are further overridden in a subclass are likely to violate the 'equals' contract.
 * 
 */
public class BadpointExt extends Badpoint {

	String s;

	BadpointExt(int x, int y, String s) {
		super(x, y);
		this.s = s;
	}

	
    // violates symmetry of equals contract
	public boolean equals(Object o) {
		if (!(o instanceof BadpointExt)) {
			return false;
		}
		BadpointExt q = (BadpointExt) o;
		return super.equals(o) && (q.s == null ? s == null : q.s.equals(s));

	}
	
//	Good:
//	 public boolean equals(Object o) {
//	        if (o != null && getClass() == o.getClass()) {
//	            GoodPoint q = (GoodPoint)o;
//	            return x == q.x && y == q.y;
//	        }
//	        return false;
//	    }

	public static void main(String[] args) {

		Badpoint p = new Badpoint(1, 3);
		BadpointExt q = new BadpointExt(1, 3, "aa");
		System.out.println(p.equals(q));

	}
}
