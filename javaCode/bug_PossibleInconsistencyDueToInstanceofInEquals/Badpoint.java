package javaSamples.Zinat.bug_PossibleInconsistencyDueToInstanceofInEquals;

/*Implementations of 'equals' that use 'instanceof' to test the type of the argument
 *and are further overridden in a subclass are likely to violate the 'equals' contract.
 * 
 */
public class Badpoint {
	int x;
	int y;

	Badpoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Badpoint)) {
			return false;
		}
		Badpoint q = (Badpoint) o;
		return x == q.x && y == q.y;

	}


//	Good:
//    public boolean equals(Object o) {
//        if (o != null && getClass() == o.getClass()) {
//            GoodPointExt q = (GoodPointExt)o;
//            return super.equals(o) && (q.s==null ? s==null : q.s.equals(s));
//        }
//        return false;
//    }

}
