package exelent;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Menu extends JFrame implements ActionListener{
	JButton jugar;
	JButton punteos;
	JButton demo;
	JButton inst;
	public void delay(){
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public Menu(){
	super("Menú");
	JLabel lab=new JLabel("TORRE DE HANOI");
	jugar=new JButton("JUGAR");
	punteos=new JButton("PUNTEOS");
	demo=new JButton("DEMO");
	inst=new JButton("INSTRUCCIONES");
	JLabel label = new JLabel(new ImageIcon("C:/Users/djg/Pictures/otras imagenes/si.jpg"));
	JLabel base= new JLabel();
	JLabel otro=new JLabel("Movimientos:");
	this.setLocation(400, 200);
	this.setSize(300, 400);
	this.setVisible(true);
	//jugar.setBackground(Color.green);
	Font fuente=new Font("Dialog", Font.PLAIN, 31);
	lab.setFont(fuente);
	lab.setForeground(Color.white);
	lab.setBounds(5, 10, 270, 50);
	jugar.setBounds(-100, 80, 100, 50);
	punteos.setBounds(-100, 150, 100, 50);
	demo.setBounds(-100,220, 100, 50);
	inst.setBounds(-150, 290, 150, 50);
	this.add(lab);
	
	this.add(jugar);
	this.add(punteos);
	this.add(demo);
	this.add(inst);	
	this.add(label);
	jugar.addActionListener(this);
	for(int s=0;s<76;s++){
		inst.setLocation(s, 80);
		delay();
	}
	for(int s=80;s<291;s++){
		inst.setLocation(75, s);
		delay();
	}
	for(int s=0;s<100;s++){
		demo.setLocation(s, 80);
		delay();
	}
	for(int s=80;s<221;s++){
		demo.setLocation(99, s);
		delay();
	}
	for(int s=0;s<100;s++){
		punteos.setLocation(s, 80);
		delay();
	}
	for(int s=80;s<151;s++){
		punteos.setLocation(99, s);
		delay();
	}
	for(int s=0;s<100;s++){
		jugar.setLocation(s, 80);
		delay();
	}
	
	
	}
	
	public static void main (String[] args){
		Menu menu=new Menu();
	}
	@Override
	public void actionPerformed(ActionEvent z) {
		if (z.getSource()==jugar){
			objetos.main(null);
			this.setVisible(false);
			this.dispose();
		}
	}

}
