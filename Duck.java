/**
 * 
 */
package Strategy;

/**
 * @author User
 *
 */
public abstract class Duck {

	protected String _name;

	public Duck() {
	}

	public void fly() {
		System.out.println("Inside Fly Duck : " + _name + " is flying");
	};

	public void quack() {
		System.out.println("Inside Quack Duck : " + _name + " is quacking");
	}

	public abstract void display();

}
