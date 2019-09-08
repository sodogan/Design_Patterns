package Strategy;

public class MallardDuck extends Duck{

	public MallardDuck() {
		super();
		setName("Mallard Duck");
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
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Inside Display Duck name " + _name );	

	}
}
