package juegoLab;

import javax.swing.JFrame;

public class Gui {

	Game game= new Game();
	JFrame frame= new JFrame("title");
	
	frame.add(game);                                      
	frame.pack();                                         
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	frame.setResizable(false);                              
	frame.setLocationRelativeTo(null);                     
	frame.setVisible(true);
	
}
