package javaSamples.Zinat.bug_CollectionIsAddedToItself;

import java.util.HashSet;
import java.util.Set;

public class CollectionIsAddedToItself {

	
	 Set<Object> setA = new HashSet<Object>(); 
	 Set<Object> setB = new HashSet<Object>();
	 Set<Object> setC = new HashSet<Object>();	 
  
	public void main(String[] args) {
		setA.add(setA);   // A collection is added to itself
		                  // This case can be detected without data flow analysis
		                  // we just need to check that the receiver and argument
		                  // of the call of add refer to the same variable. 

		setA.add(setB);   // A collection is added to itself indirectly!
		setB.add(setA);   // ... (A is added to B which is added to A)
		                  //To detect this we need dataflow analysis.

		
		setA.add(setB);   // A collection is NOT added to itself!
		setB.add(setC);   // A collection is NOT added to itself!
		                  // We MUST NOT report these two cases.

	}

}
