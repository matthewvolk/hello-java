package HelloArray;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class HelloBattle {
	
	public static void main(String[] args) {
		Monster.buildBattleBoard();
		
		char[][] tempBattleBoard = new char[10][10];
		
		// Create an array with all of our monsters inside
		// ObjectOrClassName[] ArrayName = new ObjectOrClassName[4]
		
		// Create 4 Monsters contained in an array
		Monster[] Monsters = new Monster[4];
		
		Monsters[0] = new Monster(1000, 20, 1, "Fib");
		Monsters[1] = new Monster(500, 40, 1, "Wib");
		Monsters[2] = new Monster(850, 25, 1, "Tib");
		Monsters[3] = new Monster(750, 30, 1, "Jib");
		
		Monster.redrawBoard();
		
		// Other Array Methods: The ENHANCED For Loop
		// for (dataType[] tempVariableForRow : arrayName) { ... };
		for (Monster m : Monsters) {
			if (m.getAlive()) {
				int arrayItemIndex = ArrayUtils.indexOf(Monsters, m);
				m.moveMonster(Monsters, arrayItemIndex);
			}
		}
		
		Monster.redrawBoard();
		
	}	
	
}