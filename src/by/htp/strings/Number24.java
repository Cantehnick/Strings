package by.htp.strings;

public class Number24 {
	
	public static void main(String[] args) {

		// Определить сумму всех целых чисел, встречающихся в заданном тексте.

		String text = "I1 1liKe5 ja22va1";
		int sum=0;
	
		
		StringBuilder sb=new StringBuilder();
	
	for (int i=0; i<text.toCharArray().length; i++) {
		if (Character.isDigit(text.toCharArray()[i])==true) {
			sb.append(text.toCharArray()[i]);
		
	}else if (sb.length()>0) {
		sum=sum+Integer.valueOf(sb.toString());
		sb=new StringBuilder();
			}
			}
	
	if (sb.length()>0)	{	
		sum=sum+Integer.valueOf(sb.toString());
	}
	
	
	System.out.println("sum= "+sum);	
		
		
		
		
		
		
		
//		for (int i=0; i<sb.length(); i++) {
//	if (Character.isDigit(sb.charAt(i))==true) {
//		sb.deleteCharAt(i);
//		i=0;
//		
//		}else if  (sb.length()>0) {
//			sum=sum+Integer.parseInt(sb.toString());
//			sb=new StringBuilder();
//		}
//	}
//	if (sb.length() > 0) {
//		sum += Integer.parseInt(sb.toString());
//	}
//	System.out.println(sum);
	
	}
	}

	
	
	
	
	
	
