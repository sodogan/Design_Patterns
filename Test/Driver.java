/**
 * 
 */

package Test;
import Strategy.*;
/**
 * @author Solen Dogan 
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
    
     DuckFactory _factory = new DuckFactory();
     
     Duck _redHeadDuck = _factory.createDuck("RedHead");
     _redHeadDuck.fly( );
     _redHeadDuck.quack();
     _redHeadDuck.display();
     
     
     Duck _decoyDuck = _factory.createDuck("Decoy");
     _decoyDuck.fly( );
     _decoyDuck.quack();
     _decoyDuck.display();
     
     
     
     Duck _rubberDuck = _factory.createDuck("Rubber");
     _rubberDuck.fly( );
     _rubberDuck.quack();
     _rubberDuck.display();
     
     
	}

}
