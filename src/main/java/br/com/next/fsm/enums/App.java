package br.com.next.fsm.enums;

public class App {
	private State state;

	public App() {
	        state = State.INITIAL;
	    }

	public void performRequest(String aParameter) {
		state = state.doSomething(aParameter);
	}

	public static void main(String[] args) {
		App theObject = new App();
		theObject.performRequest("Hello");
		theObject.performRequest("Hello");
		theObject.performRequest("Hello");
		theObject.performRequest("Hello");
		theObject.performRequest("Hello");
	}
}
