package javaSamples.Zinat.bug_OverloadedEqualsMethod;
/*Classes that define an equals method whose parameter type is not Object overload
 *the Object.equals method instead of overriding it. This may not be intended.
 *c.equals(b) resolves to the default definition of Object.equals and returns false
 */


public class BadPoint {
	int x;
	int y;
	public BadPoint(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	// overloaded equals method -- should be avoided
    public boolean equals(BadPoint obj) {
		return x==obj.x && y==obj.y;
    	
    }
    
    
    public static void main(String args[]) {
    	BadPoint a=new BadPoint(1,2);
    	BadPoint b=new BadPoint(1,2);
    	System.out.println("Object equality evaluates to: " + a.equals(b));
    	
    	Object c= new BadPoint(1,2); //// evaluates to false
    	System.out.println("Object equality evaluates to: " + c.equals(b));
    }
    
    
}
