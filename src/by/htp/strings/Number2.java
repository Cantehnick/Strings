package by.htp.strings;



public class Number2 {

	public static void main(String[] args) {

		String alfabet = "אבגדהו¸זחטיךכלםמןנסעףפץצקרשתûü‎‏ÿ";

		String offer = "אכוךסאםהנ דנטדמנüוגטק";

		char[] offer1 = offer.toCharArray();

		for (int i = 0; i < offer1.length; i++) {
			System.out.print(offer1[i] + "  ");
		}
		System.out.println(" ");
		
		for (int j = 0; j < offer1.length; j++) {
			if (offer1[j] == ' ') {
				System.out.print("       ");
			} else {

				int i = alfabet.indexOf(offer1[j]);
				i++;
				System.out.print(i + " ");
			}
		}

	}

}
