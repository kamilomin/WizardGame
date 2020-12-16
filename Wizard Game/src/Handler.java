import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {

	LinkedList<GameObject> object = new LinkedList<GameObject>();

	
	private boolean up = false, down = false, right = false, left = false;
	private int weapon = 1;
	// a jezeli juz tu przejdzie z klasy KeyInput to idze do np Wizard i nim rusza
	


	

	public void tick() {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
			
			
		}
	}

	public void render(Graphics g) {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
	}}
	
		public void addObject(GameObject tempObject) {
			object.add(tempObject);
		}
		public void removeObject(GameObject tempObject) {
			object.remove(tempObject);
		}
		
		public boolean isUp() {
			return up;
		}

		public void setUp(boolean up) {
			this.up = up;
		}

		public boolean isDown() {
			return down;
		}

		public void setDown(boolean down) {
			this.down = down;
		}

		public boolean isRight() {
			return right;
		}

		public void setRight(boolean right) {
			this.right = right;
		}

		public boolean isLeft() {
			return left;
		}

		public void setLeft(boolean left) {
			this.left = left;
		}
		public int getWeapon() {
			return weapon;
		}

		public void setWeapon(int weapon) {
			this.weapon = weapon;
		}
}
