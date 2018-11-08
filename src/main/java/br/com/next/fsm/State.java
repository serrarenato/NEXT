package br.com.next.fsm;

public abstract class State {

	// 6. Create a state base class that makes the concrete states interchangeable
	// 7. The State base class specifies default behavior
	public void on() {
		System.out.println("error");
	}

	public void off() {
		System.out.println("error");
	}

	public void ack() {
		System.out.println("error");
	}

}
