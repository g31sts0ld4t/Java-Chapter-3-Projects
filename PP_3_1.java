package javaFoundChapter3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PP_3_1 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = input1.next();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter last name");
		String lastName = input2.next();
		
		String firstInitial = firstName.substring(0,1);
		String last5 = lastName.substring(0,5);
		int lastNum = ThreadLocalRandom.current().nextInt(10,100);
		
		System.out.println(firstInitial + last5 + lastNum);
	}

}
