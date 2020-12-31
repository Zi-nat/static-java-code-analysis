package javaSamples.Zinat.bug_CovariantEqualsMethodDefinedForEnum;

import java.util.Objects;

public class EnumTest {
	Day day;

	public EnumTest(Day day) {

		this.day = day;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnumTest other = (EnumTest) obj;
		return day == other.day;
	}

	public static void main(String[] args) {
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		EnumTest secondDay = new EnumTest(Day.MONDAY);
		if (firstDay.equals(secondDay)) {//They may be equivalent objects but they are not the same Obj.

			System.out.println("Mondays are bad.");
		}
		if(firstDay==secondDay){ //they will never have the same identity.

			System.out.println("firstDay is equals Friday!");
		}
	}
}
