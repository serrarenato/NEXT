package br.com.next.payment.withusecase.usecase;

public class CalcPaymentWeekendUseCase extends CalcPaymentAbstractUseCase {
	public int execute(int minutesWorked, int payRate) {
		int overtimePayment = minutesWorked * payRate / 2;
		int payment = minutesWorked * payRate;
		return overtimePayment + payment;
	}
}
