import java.util.*;

public class StringMerge {
	public static String braid(String str1, String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		int max_len = Math.max(len1, len2);
		int i;
		String mixedString = "";
		
		for(i = 0; i < max_len; i++){
			if (i <= len1 - 1)
				mixedString += str1.substring(i, i + 1);
			if (i <= len2 - 1)
				mixedString += str2.substring(i, i + 1);
		}
		
		return mixedString;
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String string1;
		String string2;
		// String merged;
		
		System.out.println("Enter a string: ");
		string1 = input.nextLine();
		
		System.out.println("Enter a second string: ");
		string2 = input.nextLine();
		
		// merged = braid(string1, string2);
		
		System.out.println("The merged string is " + braid(string1, string2));
		
		input.close();
	}
}
