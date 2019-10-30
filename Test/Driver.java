/**
 * 
 */

package Test;
import com.patterns.strategy.*;
/**
 * @author Solen Dogan 
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
     Duck _redHeadDuck = DuckFactory.createDuck("RedHead");
     _redHeadDuck.fly( );
     _redHeadDuck.quack();
     _redHeadDuck.display();
          
     Duck _decoyDuck = DuckFactory.createDuck("Decoy");
     _decoyDuck.fly( );
     _decoyDuck.quack();
     _decoyDuck.display();
     
         
     Duck _rubberDuck = DuckFactory.createDuck("Rubber");
     _rubberDuck.fly( );
     _rubberDuck.quack();
     _rubberDuck.display();
     
     
 // Second sample
     BetterDuckFactory _better = new BetterDuckFactory();
     _better.setDuck(new RubberDuck());
     _better.fly( );
     _better.quack();
     _better.display();	 
      
     
     
	}

}
