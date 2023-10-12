package assignment.ty;

import java.util.Random;
import java.util.Scanner;

public class Shuffle {
	public static void shuffleArray(int[] arr) {
		Random rand=new Random();
		int n=arr.length;
		for(int i=n-1;i>0;i--) {
			int randIndex=rand.nextInt(i+1);
			int temp=arr[i];
			arr[i]=arr[randIndex];
			arr[randIndex]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		int size=ip.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
		}
		shuffleArray(arr);
		System.out.println("Shuffled Array: ");
		for(int num:arr) {
			System.out.print(num+" ");
		}

	}

}
