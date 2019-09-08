/**
 * 
 */
package Strategy;

/**
 * @author User
 *
 */
public class DecoyDuck extends Duck{

	public DecoyDuck() {
		super();
		setName("Decoy Duck");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return _name;
	}
	
	private void setName(String newName)
	{
	  this._name = newName;	
	}

	@Override
	public void fly() {
		System.out.println("This Duck : " + _name + " is not flying");
	};
	
	@Override
	public void quack() {
		System.out.println("This Quack Duck : " + _name + " is not quacking");
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Inside Display Duck name " + _name );	

	}

}
