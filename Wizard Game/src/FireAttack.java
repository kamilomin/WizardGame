import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class FireAttack extends GameObject {
	private Handler handler;
	private BufferedImage Featured_Image;
	

	public FireAttack(int x, int y, ID id, Handler handler, int mx, int my, SpriteSheet ss) {
		super(x, y, id, ss);
		this.handler = handler;

		velX = (mx - x) / 10;
		velY = (my - y) / 10;
		
		
			
		
	}

	public void tick() {
		x += velX;
		y += velY;
		for (int i = 0; i < handler.object.size(); i++) {

			GameObject tempObject = handler.object.get(i);

			if (tempObject.getId() == ID.Block) {
				if (getBounds().intersects(tempObject.getBounds())) {
					handler.removeObject(this);
				}

			
			if(handler.getWeapon()==1) {
				Featured_Image = ss.grabImage(5, 3, 32, 32);
			}
			
				
			
		}}}
		

	public void render(Graphics g) {
		g.drawImage(Featured_Image, x, y, null);
		// g.setColor(Color.green);
		// g.fillOval(x, y, 8, 8);

	}

	public Rectangle getBounds() {

		return new Rectangle(x, y, 8, 8);
	}

}
