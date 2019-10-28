package com.hk.vmv2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		
		vm.putProduct(1, 10);
		vm.putProduct(2, 10);
		vm.putProduct(3, 10);
		vm.putProduct(4, 10);
		vm.putProduct(5, 10);
		vm.showDrinks();
		System.out.println("-----------");
		vm.sales(1, 10000);
		vm.sales(2, 10000);
		vm.showDrinks();
	}
}
