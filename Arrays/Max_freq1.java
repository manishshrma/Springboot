package Arrays;

public class Max_freq1 {
	static void getMaxOccuringChar(String str) {
		int i;
		int arr[] = new int[26];
		int b = 0;
		int chIdx = 0;
		for (i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			arr[ch - 'a'] = arr[ch - 'a'] + 1;

		}
		for (i = 0; i < 26; i++) {
			
			if (arr[i] > b) {
				b = arr[i];
				chIdx = i;
			}

		}
		System.out.println((char) (chIdx + 'a'));

	}

	public static void main(String[] args) {
//		String str = "baagggggab";
		String str="abcdef";
		System.out.println(str.substring(2));
		getMaxOccuringChar(str);

		// System.out.println(z);
	}

}
