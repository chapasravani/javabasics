package com.tnsif.strings;

public class stringclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        
        // ===== Using String =====
        String str1 = "Hello";
        String str2 = str1.concat(" World");  // Strings are immutable, new object is created
        System.out.println("String Example:");
        System.out.println("Original String: " + str1);
        System.out.println("After Concatenation: " + str2);

        // ===== Using StringBuffer =====
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" World");  // StringBuffer is mutable
        sb1.insert(6, "Java ");  // Insert at index 6
        sb1.replace(0, 5, "Hi"); // Replace "Hello" with "Hi"
        sb1.reverse();           // Reverse the string
        System.out.println("\nStringBuffer Example:");
        System.out.println("After operations: " + sb1);

        // ===== Using StringBuilder =====
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");     // StringBuilder is mutable
        sb2.delete(5, 11);        // Delete characters from index 5 to 10
        sb2.insert(5, " Java");   // Insert " Java" at index 5
        sb2.replace(0, 5, "Hi");  // Replace "Hello" with "Hi"
        System.out.println("\nStringBuilder Example:");
        System.out.println("After operations: " + sb2);
    }
}

