package com.runetooncraft.tutorials.episode1;

public class Episode1 {
	int integer = 0;
	
	public Episode1(int RequiredInteger) {
		integer = RequiredInteger;
	}
	
	public static void main(String[] args) {
		Episode1 episode1 = new Episode1(3);
		System.out.println(episode1.ReturnString());
	}
	
	public int ReturnInteger(String IntegerString) { //String = asdlfja;lskdjfwoeiru1234 | int = 12319501 | double = 123.5231431 | boolean = true/false
		// if the String is an integer, it will parse the string to an integer.
		return Integer.parseInt(IntegerString);
	}
	
	public boolean ReturnBoolean() {
		return true;
	}
	
	public String ReturnString() {
		return "Hello World!";
	}
	
	public void AddIntegers(int DefinedInteger,int DefinedInteger2) { //has no return setting but just does something
		integer = DefinedInteger + DefinedInteger2;
	}
}
