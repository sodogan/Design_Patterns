package Strategy;

public class BetterDuckFactory {

	private Duck _duck;

	public void setDuck(Duck newDuck) {
		_duck = newDuck;
	}

	public void fly() {
		_duck.fly();
	}

	public void quack() {
		_duck.quack();
	}


	public void display() {
		_duck.display();
	}

	
}
