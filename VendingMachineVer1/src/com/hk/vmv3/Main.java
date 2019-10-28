package com.hk.vmv3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VendingMachine vm = new VendingMachine();
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();

		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();

		// Customer 객체화
		Customer cust = new Customer(name, money);
		// 확인하고 싶으면 toString 오버라이딩 활용하여 출력해본다.
		System.out.println();
		
		while (money > 0) {
			vm.showDrinks();

			System.out.print("\n구매할 음료수 번호를 입력하세요 : ");
			int idx = sc.nextInt();

			vm.sales(idx, cust);
			System.out.println();
			
			vm.showDrinks();
			cust.showState();

			System.out.print("계속 하시겠습니까?('y' or 'n') : ");
			String answer = sc.next();
			if (answer == "y" || answer == "Y") {
				vm.showDrinks();
			} else if(answer == "n" || answer == "N"){
				System.out.println("종료합니다.");
				break;
			}
		}
		sc.close();
	}
}
