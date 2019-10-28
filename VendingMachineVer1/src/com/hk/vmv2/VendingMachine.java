package com.hk.vmv2;

import java.util.*;
//유틸 밑에 있는 클래스들을 한번에 묶어서 사용가능
//import java.util.function.*;
//function 밑에 있는 클래스는 위의 것과 달라서 다시 임포트 해줘야함

public class VendingMachine {
	/*
	private Drink[] drinks = new Drink[10];
	// 명시적 선언부
	// 이배열먼저 실행된다. 그리고 생성자를 통해 배열지정됨.
	
	public VendingMachine() {
		//생성자를 통한 배열지정
		drinks = new Drink[5];
	}
	*/
	
	private List<Drink> drinks;
	
	public VendingMachine() {
		drinks = new ArrayList();
		
		drinks.add(new Drink("콜라", 1000));
		drinks.add(new Drink("사이다", 1100));
		drinks.add(new Drink("환타", 1200));
		drinks.add(new Drink("2%", 1300));
		drinks.add(new Drink("마운틴듀", 1400));
	}
	
	public void sales(int idx, int money) {
		// 해당 제품의 주소값 빼온다음
		// money값과 제품의 price값 비교
		// 금액이 부족하면 "금액이 부족합니다."
		// else 잔돈을 나타낸다.
		// idx 값이 마이너스 값 x
		
		/*
		System.out.println((answer+1) + "번 선택");
		Drink dr = drinks.get(idx);
		if (money < dr.getPrice()) {
			System.out.println("금액이 부족합니다.");
		} else {
			System.out.println("잔돈 : " + (money - dr.getPrice()));
		}
		*/
		
		int targetIdx = idx -1;
		if(targetIdx < 0 || targetIdx >= drinks.size()) {
			System.out.println("에러 발생");
			return;
		}
		
		//재고가 없으면 재고가 부족합니다. 메세지
		Drink d = drinks.get(targetIdx);
		if(d.getPrice() > money) {
			System.out.println("금액이 부족합니다.");
		}
		else {
			// 구매를 했다면 재고를 -1 시킨다.
			if(d.minusStock()) {
				int calc = money - d.getPrice();
				System.out.println("잔돈은 <" + calc + "원> 입니다.");
			} else {
				System.out.println("재고가 부족합니다.");
			}
		}
	}
		
	public void showDrinks() {
		/*
		 * 내가 한 포문
		for(int i = 0; i < drinks.size(); i++) {
			System.out.println( (i+1) + ". " + drinks.get());
		}
		*/
		
		/*
		int y = 1;
		for(Drink d : drinks) {
			System.out.printf("%d. %s\n", y++, d);
		}
		System.out.println("----------------");
		*/
		
		for(int i = 0; i < drinks.size(); i++) {
			Drink d = drinks.get(i);
			System.out.printf("%d. %s\n", i+1, d);
		}
	}
	
	public void putProduct(int idx, int qty) {
		//1, 10
		
		int targetIdx = idx - 1;
		if(targetIdx < 0 || targetIdx >= drinks.size()) {
			System.out.println("에러 발생!");
			return;
		} else if(qty < 0) {
			System.out.println("재고는 마이너스 불가!");
			return;
		}
		
		Drink d = drinks.get(targetIdx);
		d.setStock(qty);
	}
}






