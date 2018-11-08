package br.com.next.payment.enums;

public class Main {
	public static void main(String[] args) {
		System.out.println(PayrollDay.MONDAY.pay(40, 1));
		System.out.println(PayrollDay.SATURDAY.pay(40, 1));
		System.out.println(PayrollDay.THURSDAY.pay(500, 1));
	}
}
