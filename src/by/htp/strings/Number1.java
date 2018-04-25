package by.htp.strings;

public class Number1 {

	public static void main(String[] args) {

		String offer = "александр григорьевич";
		char sumbol = '@';
		int index = 4;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < offer.split(" ").length; i++) {
			if (offer.split(" ")[i].length() >= index) {
	sb.append(offer.split(" ")[i].substring(0, index - 1)).append(sumbol).append(offer.split(" ")[i].substring(index, offer.split(" ")[i].length())).append(" ");

				
			}
			
			
		}
		
		System.out.println(sb.toString());

	}

}
