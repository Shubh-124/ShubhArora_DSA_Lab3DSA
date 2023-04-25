package com.glearning.balancingbrackets;
import java.util.*;
public class Client {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the string: ");  
		String input= sc.nextLine();    
		sc.close();
		balancedBrackets checkBracket = new balancedBrackets();

		boolean result = checkBracket.isBalanced(input);

		if (result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");


	}

}
