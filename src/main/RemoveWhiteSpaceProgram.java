package main;

public class RemoveWhiteSpaceProgram {

	public static void main(String[] args) {
		String str = "Pedro Gabriel Cavalheiro";
		
		String stringWithoutWhiteSpaces = removeWhiteSpaces(str);
		System.out.println(stringWithoutWhiteSpaces);
	}

	private static String removeWhiteSpaces(String str) {
		StringBuilder stringBuilder = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (!Character.isWhitespace(c)) {
				stringBuilder.append(c);
			}
		}

		return stringBuilder.toString();
	}
}
