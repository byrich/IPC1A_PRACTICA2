package exelent;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
public class Instrucciones extends JFrame{
	JTextArea a;
	public Instrucciones(){
		a=new JTextArea();
		a.setBackground(Color.black);
		a.setForeground(Color.white);
		Font fuente=new Font("Dialog", Font.HANGING_BASELINE, 20);
		a.setFont(fuente);
		a.setText("El juegoconsiste en tres varillas verticales. \nEn una de las varillas se apila ocho discos.\nen tama�o decreciente. No hay dos discos\niguales, quedando las otras dos varillas\nvacantes. El juego consiste en pasar todos\n los discos de la varilla ocupada a una \nde las otras varillas vacantes. \nPara realizar este objetivo,es necesario\nseguir tres simples reglas: \n\n1) S�lo se puede mover un disco cada vez.\n\n2) Un disco de mayor tama�o no puede descansar \nsobre uno m�s peque�o que �l mismo.");
		this.setVisible(true);
		this.setSize(475,500);
		 //

			//
			//
			//S�lo puedes desplazar el disco que se encuentre arriba en cada varilla.
		this.add(a);
		
	}
	public static void main (String[] args){
		Instrucciones i=new Instrucciones();
	}
	
	}
