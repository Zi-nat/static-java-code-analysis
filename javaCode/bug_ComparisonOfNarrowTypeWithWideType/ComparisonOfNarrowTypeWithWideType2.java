package javaSamples.Zinat.bug_ComparisonOfNarrowTypeWithWideType;

public class ComparisonOfNarrowTypeWithWideType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int BIGNUM = Integer.MAX_VALUE;
		long MAXGET = Short.MAX_VALUE + 1;
		char[] buf = new char[BIGNUM];
		int bytesReceived = 0;
		
		/*BAD: 'bytesReceived' is compared with a value of wider type.
		 *bytesReceived overflows before reaching MAXGET,
		 *causing an infinite loop.
		 */
		while (bytesReceived < MAXGET) {
			bytesReceived += getFromInput(buf, bytesReceived);
		}

	}

	
	
	public static int getFromInput(char[] buf, int pos) {
		// write to buf
		// ...
		return 1;
	}

}
