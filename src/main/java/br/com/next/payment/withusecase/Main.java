package br.com.next.payment.withusecase;

import br.com.next.payment.withusecase.enums.PayrollDay;
import br.com.next.payment.withusecase.usecase.CalcPaymentUseCase;

public class Main {
	public static void main(String[] args) {
		System.out.println(CalcPaymentUseCase.execute(40, 1, PayrollDay.MONDAY));
		System.out.println(CalcPaymentUseCase.execute(40, 1, PayrollDay.SATURDAY));
		System.out.println(CalcPaymentUseCase.execute(500, 1, PayrollDay.THURSDAY));
	}

}
