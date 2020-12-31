package javaSamples.Zinat.bug_BooleanReturntype;

import java.util.ArrayList;
import java.util.List;

public class BooleanExpression {
	boolean f1(List<Boolean> l) {
		for (Boolean x : l) { //doesn't handle Null case
			if (x == true) {
				return true;
			}

		}
		return false;
	}

	boolean f2(List<Boolean> l) {
		for (Boolean x : l) { //doesn't handle Null case
			if (x) {
				return true;
			}

		}
		return false;
	}

	void g1(List<Boolean> l1) {
		List<Boolean> l2 = new ArrayList<Boolean>();
		for (Boolean x : l1) { //doesn't handle Null case
			l2.add(x == true);
		}
	}

}
/*Method g2 might be more appropriate. In any case, care should be taken to ensure 
 *correct behaviour for null values when the boxed type Boolean is used.

	void g2(List<Boolean> l1) {
		List<Boolean> l2 = new ArrayList<Boolean>();
		for (Boolean x : l1) {
			if (x == null) {
				// handle null case
			}
			l2.add(x);
		}
	}

*/
