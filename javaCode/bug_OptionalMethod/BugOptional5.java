package javaSamples.Zinat.bug_OptionalMethod;

import java.util.Optional;
/*avoid Optional<T> with the generic type. Boxing and unboxing are expensive processes
 *that can lead to reduced performance. To avoid this risk, we can rely on “wrappers for primitive types”.
 */
public class BugOptional5 {

	public static void main(String[] args) {
		Optional<Integer> price = Optional.of(50);
	}
	
}
