package javaSamples.Zinat.bug_RecursiveLoop;

public class RecursiveLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
   /*This method unconditionally invokes itself.
    * This would seem to indicate an infinite recursive loop
    * that will result in a stackOverflow
    */
	
	public static void f() {
		f();
	}


	public static boolean g() {
		if (g()) {
			return true;
		} else {
			return g();
		}
	}
}
