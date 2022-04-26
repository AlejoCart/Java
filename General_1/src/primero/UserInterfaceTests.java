package primero;

import java.awt.*;
import javax.swing.*;

public class UserInterfaceTests extends JFrame{

	public UserInterfaceTests() {
		this.setSize(400,400);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setIconImage();
	}
	
	public static void main(String args[]) {
		
		UserInterfaceTests UE=new UserInterfaceTests();
		UE.setTitle("Demo of the actual game");
		JPanel thePanel=new JPanel();
		JLabel label1= new JLabel("Etiqueta del panel");
		label1.setToolTipText("Esto no hace nada :D");
		thePanel.add(label1);
		//label1.setToolTipText("Esto no hace nada :C");
		UE.add(thePanel);
		JButton boton= new JButton();
		boton.setText("Un boton a la nada");
		boton.setToolTipText("Este tampoco hace nada :DD:");
		thePanel.add(boton);
		
		JTextField campoTexto= new JTextField("Texto aqui ",15);
		campoTexto.setToolTipText("Campo de texto vacio, have fun");
		campoTexto.setText("Texto?");
		thePanel.add(campoTexto);
		JTextField textField1 = new JTextField("Type Here", 15);
		textField1.setColumns(10);
		textField1.setText("New Text Here");
		textField1.setToolTipText("More of nothing");
		thePanel.add(textField1);
		thePanel.add(campoTexto);
		JTextArea textArea1 = new JTextArea(15, 20);
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		thePanel.add(textArea1);
		thePanel.add(scrollbar1);


		//label1.setToolTipText("Esto no hace nada <:C"); Se puede modificar aun despues de conectarlo a un panel
		
		//thePanel.setBackground();
	
	}
	
}
