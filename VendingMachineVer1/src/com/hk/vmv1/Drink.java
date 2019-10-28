package com.hk.vmv1;

public class Drink {
	private String pName;
	private int price;
	//private 은닉화
	// 생성자, get메소드, set메소드
	
	// 리턴 타입이 없다. 클래스 명이랑 이름이 똑같다.
	/* 내가 한것
	public Drink() {
		
	}
	
	public void getDrink(String pn, int p) {
		this.pName = pn;
		this.price = p;
	}
	
	public int setDrink() {
		return price;
	}
	*/
	
	//set메소드는 값을 받는 것. 
	public Drink(String pName, int price) {
		this.pName = pName;
		this.price = price;
	}

	public String getPName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return String.format("%s. %d", getPName(), price);
	}

}
