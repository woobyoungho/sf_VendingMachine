package com.hk.vmv1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		VendingMachine VM = new VendingMachine();
		
		Scanner sc = new Scanner(System.in);
		
		VM.purchase(1, 10000);
		VM.showDrinks();
	}
}
