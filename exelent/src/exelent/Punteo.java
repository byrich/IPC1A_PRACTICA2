package exelent;

	import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
	public class Punteo extends JFrame{
		JList punte=new JList();
		DefaultListModel model;
		public Punteo(){
		super("Menú");
		
		model=new DefaultListModel();
		JLabel label= new JLabel(new ImageIcon("C:/Users/djg/Pictures/otras imagenes/verde.jpg"));
		JLabel base= new JLabel();
		JLabel otro=new JLabel("Movimientos:");
		this.setSize(600, 500);
		this.setLocation(300,200);
		this.setVisible(true);
		punte.setBackground(Color.BLACK);
		punte.setForeground(Color.white);
		model.addElement("Nombre: ; Movimientos: ; Difucultad: ; Tiepo: ");
		model.addElement("jola");
		model.addElement("jola");
		model.addElement("jola");
		model.addElement("jola");
		Font fuente=new Font("Dialog", Font.PLAIN, 15);
		punte.setFont(fuente);
		punte.setLocation(0,-10);
		punte.setModel(model);
		this.add(punte);
		}
		
		public static void main (String[] args){
			Punteo punt=new Punteo();
		}

	}


