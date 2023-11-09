package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		System.out.println("test9");
		
		String[] foodArr = {"mango","oranage","maracuja","banana","grape"};
		
		int arrLength = foodArr.length;
		String fave = foodArr[0];
		String last = foodArr[arrLength-1];
		
		System.out.println("length: "+arrLength);
		System.out.println("favorite food: "+fave);
		System.out.println("least favorite food: "+last);
	}
}
