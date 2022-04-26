package game_1;

import javax.swing.*;
import java.awt.*;

public class Tablero_Interfaz extends JFrame {

	public Tablero_Interfaz() {
		
		this.setSize(400,400);
		//this.setResizable(false);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		this.setLocation(xPos, yPos);
		setVisible(true);
		this.setTitle("Main frame");
		JPanel MainPanel= new JPanel();
		this.add(MainPanel);
		JLabel label1= new JLabel("Etiqueta");
		label1.setText("aqaa");
		label1.setToolTipText("etiqueta :D");
		MainPanel.add(label1);
		JTextArea areaTexto=new JTextArea(15,4);
		areaTexto.setLineWrap(true);
		
	}
	
	public static void main(String args[]) {
		
		 new Tablero_Interfaz();
		
		
	}
	
}
