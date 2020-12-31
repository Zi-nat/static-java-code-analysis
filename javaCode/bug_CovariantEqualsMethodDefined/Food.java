package javaSamples.Zinat.bug_CovariantEqualsMethodDefined;

import java.util.Objects;

public class Food {
	
	private Season ripe;

	@Override
	public int hashCode() {
		return Objects.hash(ripe);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(ripe, other.ripe);
	}

}
