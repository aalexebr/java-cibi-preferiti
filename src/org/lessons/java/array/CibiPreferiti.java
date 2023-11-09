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
		
		String middle = foodArr[arrLength/2];
		double x = (double) arrLength/2;
		System.out.println("test decimal division: "+x);
		System.out.println("food in the middle with odd lenght array: "+middle);
		
		String[] foodArr2 = {"mango","oranage","maracuja","banana","grape","berry"};
		int arrLength2 = foodArr2.length;
		String middle2 = foodArr2[arrLength2/2];
		String middle3 = foodArr2[(arrLength2/2) -1];
		System.out.println("foods in the middle with even lenght array: "+middle2+" and "+middle3);
	}
}
