package javaSamples.Zinat.bug_EqualsMethodAlwaysReturnsTrue;

public class Squar {

	protected int width = 0;

	public Squar(int width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) { // This method works only for squares.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Squar other = (Squar) obj;
		if (width != other.width)
			return false;
		return true;
	}

}
