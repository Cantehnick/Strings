package by.htp.strings;

public class Number7 {

	public static void main(String[] args) {

		// »з текста удалить все символы, кроме пробелов, не €вл€ющиес€ буквами. ћежду
		// последовательност€ми подр€д идущих букв оставить хот€ бы один пробел.

		String text = "I like   JAVA   %$#@45";

		StringBuilder sb = new StringBuilder(text);

		System.out.println(sb.toString());

		for (int i = 0; i < sb.length(); i++) {
			if (Character.isLetter(sb.charAt(i)) == false && sb.charAt(i) != ' ') {
				sb.deleteCharAt(i);
				i = 0;
			}
		}
		System.out.println("Delete all sumbols : " + sb.toString());

		for (int i = 0; i < sb.length() - 1; i++) {
			if (Character.isLetter(sb.charAt(i + 1)) == true && sb.charAt(i) != ' ') {
				sb.insert(i + 1, ' ');
				i++;
			}
		}
		System.out.println("Add '  ' : " + sb.toString());

	}
}
