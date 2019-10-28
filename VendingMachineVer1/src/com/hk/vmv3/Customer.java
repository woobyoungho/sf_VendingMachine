package com.hk.vmv3;

import java.util.*;

public class Customer {
	private List<Drink> drinks = new ArrayList();
	private String name;
	private int money;
	
	public Customer(String name, int money) {
		init();
		this.name = name;
		this.money = money;
	}
	
	public void init() {
		drinks.add(new Drink("콜라", 1000));
		drinks.add(new Drink("사이다", 1100));
		drinks.add(new Drink("환타", 1200));
		drinks.add(new Drink("2%", 1300));
		drinks.add(new Drink("마운틴듀", 1400));
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	//구매
	public void purchase(int idx) {
		addStock(idx);
		payMoney(idx);
		System.out.println("-----구매 완료-----");
	}
	
	//재고 1씩 올리기
	public void addStock(int idx) {
		drinks.get(idx).plusStock();
		/*
		Drink d = drinks.get(idx);
		int stock = d.getStock();
		d.setStock(stock++);
		*/
	}
	
	//금액 사용하기
	public void payMoney(int idx) {
		Drink d = drinks.get(idx);
		money -= d.getPrice();
	}
	
	public void showState() {
		System.out.println();
		System.out.println("<" + name + "> 고객의 재고 상태");
		for (int i = 0; i < drinks.size(); i++) {
			Drink d = drinks.get(i);
			System.out.printf("%d. %s\n", (i + 1), d);
		}
		System.out.println("\n잔돈 : " + money);
	}
	
	@Override
	public String toString() {
		return name + ", " + money;
	}
}
