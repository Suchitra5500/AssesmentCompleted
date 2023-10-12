package assignment.ty;

import java.util.HashMap;
import java.util.Scanner;

public class RomanNumToInteger {
	public static  int romanToInt(String s) {
		HashMap<Character, Integer> romanValues=new HashMap<>();
		romanValues.put('I', 1);
		romanValues.put('V', 5);
		romanValues.put('X', 10);
		romanValues.put('L', 50);
		romanValues.put('C', 100);
		romanValues.put('D', 500);
		romanValues.put('M', 1000);
		int result=0;
		int preValue=0;
		for(int i=s.length()-1;i>=0;i--) {
			char currentChar=s.charAt(i);
			int currentValue=romanValues.get(currentChar);
			if(currentValue<preValue) {
				result -=currentValue;
			}
			else {
				result +=currentValue;
			}
			preValue=currentValue;
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the roman number");
		String roman=ip.nextLine().toUpperCase();
		int result=romanToInt(roman);
		System.out.println("Integer: "+result);

	}

}
