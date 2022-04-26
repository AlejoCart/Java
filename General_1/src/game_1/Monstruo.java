package game_1;

public class Monstruo implements Cloneable {
	
	private String name;
	private char nameI;
	private int live;
	private int orden;
	private int posicionx;
	private int posiciony;
	private boolean alive=true;
	private int maxMovement;
	
	public Monstruo (String name, int life,int movement) {
		
		this.name=name;
		this.nameI=name.charAt(0);		
		this.live=live;
		this.maxMovement=movement;
		
	}
	
	public void changeName(String name) {
		this.name=name;
	}
	public void changelive(int live) {
		this.live=live;
	}
	
	public char getnameI() {
		return nameI;
	}
	public void setOrden(int o) {
		this.orden=o;
	}
	public void setX(int i) {
		this.posicionx=i;
	}
	public void setY(int i) {
		this.posiciony=i;
	}
	public int getX() {
		return this.posicionx;
	}
	public int gety() {
		return this.posiciony;
	}
	public void checkAlive() {
		alive= (live>0)? true:false;
	}
	public int getMaxMovement() {
		return this.maxMovement;
	}
	public Monstruo clone() {
		
		Monstruo mon;
		
		try {
			mon=(Monstruo) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
		
		return mon;
		
	}

}