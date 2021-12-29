package tutor;

import java.util.Scanner;

public class Main{
	
	public static void main(String[]args) {
	try (Scanner in = new Scanner(System.in)) {
		char letter = in.next().charAt(0);
		
		int ascii = (int)letter;
		
		System.out.println(ascii);
	}
}   
}