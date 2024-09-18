package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input n");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean [] array = new boolean [n];
		int index = 0;
			while (index < n) {
				array[index] = true;
				index++;
			}
		int p = 2;
		int indexTest = 0;
		while (p < n) {
			while (indexTest < n) {
			if (indexTest % p == 0) {
				if (indexTest / p == 1) {
					array[indexTest] = true;
				}
				else {
					array[indexTest] = false;}
			}
			if (indexTest % p != 0) {
				array[indexTest] = false;
			}
				
			
		indexTest++;	
		}
		
		p++;}

		int i = 0;
		while (i < n) {
			if (array[i] = true) {
				System.out.println(i);
				i++;
			}
}
}
}
