package javaSamples.Zinat.bug_CollectionIsAddedToItself;

import java.util.HashSet;
import java.util.Set;


public class Collection {

	
/*A collection is added to itself. As a result,
 *computing the hashCode of this set will throw a StackOverflowException
 */
 
	@Override
	public int hashCode() {
		return set.hashCode();
	}
	
	 Set<Object> set = new HashSet<Object>();
	 Collection container = new Collection();
	
	public void main(String[] args) {
		set.add(container);
	}
	
}
