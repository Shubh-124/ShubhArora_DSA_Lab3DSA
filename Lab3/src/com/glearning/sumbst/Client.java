package com.glearning.sumbst;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		sumBST tree = new sumBST();

		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(30);
		tree.insert(50);
		tree.insert(70);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter sum:");
		int sum=s.nextInt();
		s.close();
		if(!tree.findSum(sum)) {
			System.out.println("Nodes are not found for sum " + sum);
		}		
	}

}
