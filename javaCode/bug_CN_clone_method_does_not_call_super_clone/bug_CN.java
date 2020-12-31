package javaSamples.Zinat.bug_CN_clone_method_does_not_call_super_clone;

class bug_CN implements Cloneable {
	private String name;
	
	public bug_CN(String name) {
		this.name = name;
	}
	// BAD: 'clone' does not call 'super.clone'.
	public bug_CN clone() {
		return new bug_CN(this.name);
	}

}
