package javaSamples.Zinat.bug_CN_clone_method_does_not_call_super_clone;

public class bug_CN2 extends bug_CN implements Cloneable{
	
	Object bla = null;
	
	public bug_CN2(String name) {
		super(name);
	}
	
	
//	private void f(int x) {
//		if  ( x=true && y>3) {
//			x=2;
//		} else {
//			
//		}
//	}
	
	
	public bug_CN2 clone() {
		 bug_CN2 temp = (bug_CN2)super.clone();
//		 temp.bla = bla.clone();
		 return temp;
	}

}
