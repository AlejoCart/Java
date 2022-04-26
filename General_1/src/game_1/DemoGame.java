package game_1;

public class DemoGame {

	public static void main(String args[]) {
		
		Tablero table1= new Tablero(10,10);
		
		table1.drawTable();
		Monstruo m1=new Monstruo("Frank",500,3);
		Monstruo m2=new Monstruo("Henry",400,4);
		Monstruo m3=new Monstruo("Ry",300,3);
		Monstruo m4=new Monstruo("Arank",500,3);
		Monstruo m5=new Monstruo("Benry",400,7);
		Monstruo m6=new Monstruo("Cy",300,3);
		Monstruo m7=new Monstruo("Drank",500,6);
		Monstruo m8=new Monstruo("Jenry",400,1);
		Monstruo m9=new Monstruo("Ly",300,10);
		Monstruo m10=m1.clone();
		Monstruo m11=m4.clone();
		
		table1.addMonTable(m1);
		table1.addMonTable(m2);
		table1.addMonTable(m3);
		table1.addMonTable(m4);
		table1.addMonTable(m5);
		table1.addMonTable(m6);
		table1.addMonTable(m7);
		table1.addMonTable(m8);
		table1.addMonTable(m9);
		table1.addMonTable(m10);
		table1.addMonTable(m11);
		
		table1.drawTable();
		
		table1.moveMonstersRand();
		table1.drawTable();
		System.out.println();
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		//System.out.println("Posicion x:"+m1.getX()+" posicion y:"+m1.gety() );
			
	}
}
