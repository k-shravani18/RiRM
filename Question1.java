package com.rirm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile Number: ");
		String n = sc.nextLine();
		if (validateMobileNumber(n)) {
			System.out.println("Valid Mobile Number");
		}
		else {
			System.out.println("Not Valid Mobile Number");
		}
		
	}
	
	public static boolean validateMobileNumber(String st) {
		Pattern pattern = Pattern.compile("^(?:\\(?([0-9]{3})\\)?[-. ]?)?([0-9]{3})[-. ]?([0-9]{4})$");
		Matcher match = pattern.matcher(st);
		return (match.find()&&match.group().equals(st));
	}

}

