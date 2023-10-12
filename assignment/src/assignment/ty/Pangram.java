package assignment.ty;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
	public static boolean checkPanagram(String s) {
		Set<Character> letters=new HashSet<>();
		s=s.toLowerCase();
		for(char c:s.toCharArray()) {
			if(c>='a'&&c<='z') {
				letters.add(c);
			}
		}
		return letters.size()==26;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s=ip.nextLine();
		boolean isPangram=checkPanagram(s);
		if(isPangram) {
			System.out.println("The input is panagram");
		}
		else {
			System.out.println("The sentence is not a panagrm");
		}

	}

}
