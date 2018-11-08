package br.com.next.payment.withusecase.usecase;

import br.com.next.payment.withusecase.enums.PayrollDay;

public class CalcPaymentUseCase {
	public static int execute(int minutesWorked, int payRate, PayrollDay payrollDay) {
		CalcPaymentAbstractUseCase calcPayment = payrollDay.getPayType().newInstance();
		return calcPayment.execute(minutesWorked, payRate);
	}
}
