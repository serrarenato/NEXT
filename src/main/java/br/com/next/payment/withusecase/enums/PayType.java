package br.com.next.payment.withusecase.enums;

import br.com.next.payment.withusecase.usecase.CalcPaymentAbstractUseCase;
import br.com.next.payment.withusecase.usecase.CalcPaymentWeekDayUseCase;
import br.com.next.payment.withusecase.usecase.CalcPaymentWeekendUseCase;

public enum PayType {
	WEEKDAY {
		public CalcPaymentAbstractUseCase newInstance() {
			return new CalcPaymentWeekDayUseCase();
		}
	},
	WEEKEND {
		public CalcPaymentAbstractUseCase newInstance() {
			return new CalcPaymentWeekendUseCase();
		}
	};
	public abstract CalcPaymentAbstractUseCase newInstance();
}
