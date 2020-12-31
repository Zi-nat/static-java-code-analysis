package javaSamples.Zinat.bug_ComparisonOfNarrowTypeWithWideType;

public class ComparisonOfNarrowTypeWithWideType {

	public static void main(String[] args) {

		int BIGNUM = Integer.MAX_VALUE;
		long MAXGET = Short.MAX_VALUE + 1;
		char[] buf = new char[BIGNUM];
		short bytesReceived = 0;
		
		/*BAD: 'bytesReceived' is compared with a value of wider type.
		 *bytesReceived overflows before reaching MAXGET,
		 *causing an infinite loop.
		 */
		while (bytesReceived < MAXGET) {
			bytesReceived += getFromInput(buf, bytesReceived);
		}
		

	}


	public static int getFromInput(char[] buf, short pos) {
		// write to buf
		// ...
		return 1;
	}

}
