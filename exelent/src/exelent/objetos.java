package exelent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.io.*;

import javax.swing.*;
 public class objetos extends JFrame implements ActionListener, MouseListener{
	 int si,yea,cantidad,seg,min;
	 Timer timer=new Timer(1000,this);
	 ArrayList<Integer> base1 = new ArrayList<Integer>();
	 ArrayList<Integer> base2 = new ArrayList<Integer>();
	 ArrayList<Integer> base3 = new ArrayList<Integer>();
	 int uu[]={1,1,1};
	 int dd[]={1,2,2};
	 int tt[]={1,3,3};
	 int cc[]={1,4,4};
	 int cq[]={1,5,5};
	 int ss[]={1,6,6};
	 int st[]={1,7,7};
	 int oo[]={1,8,8};
	 JTextField tra;
	 JButton b;
	 JLabel fin;
	 JTextField name;
	 JComboBox spin;
	 JButton subm;
	 JButton menu;
		JButton ll;
		JButton lll;
		JButton llll;
		JButton lllll;
		JButton llllll;
		JButton lllllll;
		JButton llllllll;
		JLabel falta;
		JLabel uno;
		JLabel dos;
		JLabel tres;
		JTextField t;
	
	private void conta(){
		yea=yea+1;
		t.setText("");
		t.setText("" + yea);
	    }
	private void unos(){
		b.setBackground(Color.decode("0X8BFA5A"));
        si=0;
	    }
	private void doss(){
		ll.setBackground(Color.decode("0XC204F2"));
        si=0;
	}
	private void tress(){
		lll.setBackground(Color.decode("0X6037BF"));
		si=0;
	}
	private void cuatros(){
		llll.setBackground(Color.decode("0X3202F4"));
        si=0;
	    }
	private void cincos(){
		lllll.setBackground(Color.decode("0X7D1349"));
        si=0;
	}
	private void seiss(){
		llllll.setBackground(Color.decode("0X2D5464"));
		si=0;
	}
	private void sietes(){
		lllllll.setBackground(Color.decode("0X124804"));
        si=0;
	    }
	private void ochos(){
		llllllll.setBackground(Color.decode("0X11130F"));
        si=0;
	}
	
		private void finalito(){
			timer.stop();
			fin.setLocation(0, 0);
			name.setLocation(200, 260);
			subm.setLocation(260, 260);
			menu.setLocation(350, 260);
			b.setEnabled(false);
			ll.setEnabled(false);
			lll.setEnabled(false);
			llll.setEnabled(false);
			lllll.setEnabled(false);
			llllll.setEnabled(false);
			lllllll.setEnabled(false);
			llllllll.setEnabled(false);
		try{
		FileWriter w = new FileWriter("C:/Users/djg/Pictures/otras imagenes/basedatos.txt",true);
		BufferedWriter bw = new BufferedWriter(w);
		PrintWriter wr = new PrintWriter(bw);  
		wr.println("Nombre: " + tra.getText() + "; Movimientos: " + t.getText() + "; Difucultad: " + spin.getSelectedItem() + "; Tiepo: " + tra.getText());
		
		wr.close();
		bw.close();
		}catch(IOException e){};
		
		 }
		
		public objetos() {
		super("TOTORO");
		seg=0;
		min=0;
		name = new JTextField(20);
		name.setText("usuario");
		base1.add(8);
		base1.add(7);
		base1.add(6);
		base1.add(5);
		base1.add(4);
		base1.add(3);
		base1.add(2);
		base1.add(1);
		cantidad=8;
		subm= new JButton("Submit"); 
		menu= new JButton("Menú");
		JLabel label = new JLabel(new ImageIcon("C:/Users/djg/Pictures/otras imagenes/verde.jpg"));
		JLabel base= new JLabel();
		JLabel otro=new JLabel("Movimientos:");
		JLabel can=new JLabel("Dificultad:");
		fin =new JLabel(new ImageIcon("C:/Users/djg/Desktop/Sin título-2.png"));
		spin = new JComboBox();
		spin.addItem("8 discos");
		spin.addItem("7 discos");
		spin.addItem("6 discos");
		spin.addItem("5 discos");
		spin.addItem("4 discos");
		spin.addItem("3 discos");
		uno= new JLabel();
		dos= new JLabel();
		tres= new JLabel();
		t = new JTextField(5);
		tra = new JTextField(5);
		falta=new JLabel("MOVIMIENTO NO VALIDO");
		b = new JButton();
		ll = new JButton();
		lll = new JButton();
		llll = new JButton();
		lllll = new JButton();
		llllll = new JButton();
		lllllll = new JButton();
		llllllll = new JButton();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocation(200, 200);
		this.setVisible(true);
		this.setSize(590, 400);
		t.setEditable(false);
		name.setBounds(0, -20, 50, 20);
		subm.setBounds(0, -20, 80, 20);
		menu.setBounds(0, -20, 80, 20);
		b.setBackground(Color.decode("0X8BFA5A"));
		b.setBounds(60, 100, 80, 20);
		ll.setBackground(Color.decode("0XC204F2"));
		ll.setBounds(55, 120, 90, 20);
		lll.setBackground(Color.decode("0X6037BF"));
		lll.setBounds(50, 140,100, 20);
		llll.setBackground(Color.decode("0X3202F4"));
		llll.setBounds(45, 160, 110, 20);
		lllll.setBackground(Color.decode("0X7D1349"));
		lllll.setBounds(40, 180,120, 20);
		llllll.setBackground(Color.decode("0X2D5464"));
		llllll.setBounds(35, 200, 130, 20);
		lllllll.setBackground(Color.decode("0X124804"));
		lllllll.setBounds(30, 220,140, 20);
		llllllll.setBackground(Color.decode("0X11130F"));
		llllllll.setBounds(25, 240, 150, 20);
		fin.setBounds(-590, -400,590, 400);
		base.setOpaque(true);
		base.setBackground(Color.white);
		base.setBounds(10, 260, 550, 20);
		uno.setOpaque(true);
		uno.setBackground(Color.white);
		uno.setBounds(90, 80, 20, 180);
		dos.setOpaque(true);
		dos.setBackground(Color.white);
		dos.setBounds(265, 80, 20, 180);
		tres.setOpaque(true);
		tres.setBackground(Color.white);
		tres.setBounds(440, 80, 20, 180);
		otro.setBounds(20,320,150,20);
		otro.setForeground(Color.white);
		can.setBounds(160,320,150,20);
		can.setForeground(Color.white);
		t.setBounds(100,320,40,20);
		tra.setBounds(380,320,40,20);
		spin.setBounds(230, 320, 100, 20);
		falta.setBounds(200, 260, 200, 20);
		falta.setForeground(Color.white);
		falta.setVisible(false);
		this.add(subm);
		this.add(menu);
		this.add(name);
		this.add(fin);
		this.add(tra);
		this.add(can);
		this.add(falta);
		this.add(t);
		this.add(spin);
		this.add(otro);
		this.add(llllllll);
		this.add(lllllll);
		this.add(llllll);
		this.add(lllll);
		this.add(llll);
		this.add(lll);
		this.add(ll);
		this.add(b);
		this.add(base);
		this.add(uno);
		this.add(dos);
		this.add(tres);
		this.add(label);
		spin.addActionListener(this);
		falta.addMouseListener(this);
		tres.addMouseListener(this);
		dos.addMouseListener(this);
		uno.addMouseListener(this);
		b.addActionListener(this);
		ll.addActionListener(this);
		lll.addActionListener(this);
		llll.addActionListener(this);
		lllll.addActionListener(this);
		llllll.addActionListener(this);
		lllllll.addActionListener(this);
		llllllll.addActionListener(this);		
	}
	
public static void main (String[] args){
	objetos objetos=new objetos();
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource()==timer){
		seg++;
		if (seg==60){
			seg=0;
			min++;
		}
	tra.setText(min +" : " + seg);
	}
	if (e.getSource()==spin){
		if(spin.getSelectedItem().equals("8 discos")){
			b.setLocation(60, 100);
			ll.setLocation(55, 120);
			lll.setLocation(50, 140);
			llll.setLocation(45, 160);
			lllll.setLocation(40, 180);
			llllll.setLocation(35, 200);
			lllllll.setLocation(30, 220);
			llllllll.setLocation(25, 240);
			base1.clear();
			base1.add(8);
			base1.add(7);
			base1.add(6);
			base1.add(5);
			base1.add(4);
			base1.add(3);
			base1.add(2);
			base1.add(1);
			cantidad=8;
		}
		if(spin.getSelectedItem().equals("7 discos")){
			b.setLocation(60, 120);
			ll.setLocation(55, 140);
			lll.setLocation(50, 160);
			llll.setLocation(45, 180);
			lllll.setLocation(40, 200);
			llllll.setLocation(35, 220);
			lllllll.setLocation(30, 240);
			llllllll.setLocation(25, -20);
			base1.clear();
			base1.add(7);
			base1.add(6);
			base1.add(5);
			base1.add(4);
			base1.add(3);
			base1.add(2);
			base1.add(1);
			cantidad=7;
		}
		if(spin.getSelectedItem().equals("6 discos")){
			b.setLocation(60, 140);
			ll.setLocation(55, 160);
			lll.setLocation(50, 180);
			llll.setLocation(45, 200);
			lllll.setLocation(40, 220);
			llllll.setLocation(35, 240);
			lllllll.setLocation(30, -20);
			llllllll.setLocation(25, -20);
			base1.clear();
			base1.add(6);
			base1.add(5);
			base1.add(4);
			base1.add(3);
			base1.add(2);
			base1.add(1);
			cantidad=6;
		}
		if(spin.getSelectedItem().equals("5 discos")){
			b.setLocation(60, 160);
			ll.setLocation(55, 180);
			lll.setLocation(50, 200);
			llll.setLocation(45, 220);
			lllll.setLocation(40, 240);
			llllll.setLocation(35, -20);
			lllllll.setLocation(30, -20);
			llllllll.setLocation(25, -20);
			base1.clear();
			base1.add(5);
			base1.add(4);
			base1.add(3);
			base1.add(2);
			base1.add(1);
			cantidad=5;
		}
		if(spin.getSelectedItem().equals("4 discos")){
			b.setLocation(60, 180);
			ll.setLocation(55, 200);
			lll.setLocation(50, 220);
			llll.setLocation(45, 240);
			lllll.setLocation(40, -20);
			llllll.setLocation(35, -20);
			lllllll.setLocation(30, -20);
			llllllll.setLocation(25, -20);
			base1.clear();
			base1.add(4);
			base1.add(3);
			base1.add(2);
			base1.add(1);
			cantidad=4;
		}
		if(spin.getSelectedItem().equals("3 discos")){
			b.setLocation(60, 200);
			ll.setLocation(55, 220);
			lll.setLocation(50, 240);
			llll.setLocation(45, -20);
			lllll.setLocation(40, -20);
			llllll.setLocation(35, -20);
			lllllll.setLocation(30, -20);
			llllllll.setLocation(25, -20);
			base1.clear();
			base1.add(3);
			base1.add(2);
			base1.add(1);
			cantidad=3;
		}	
	}
	if (e.getSource()==b) {
		timer.start();
		if (si==0){
		si=1;
        b.setBackground(Color.white);
		}
		else{
			si=0;
	        b.setBackground(Color.decode("0X8BFA5A"));
	        
		}
			
	}
	if (e.getSource()==ll) {
		if (si==0){
		si=2;
        ll.setBackground(Color.white);
		}
		else{
			si=0;
			ll.setBackground(Color.decode("0XC204F2"));
		}
	}
	if (e.getSource()==lll) {
		if (si==0){
		si=3;
        lll.setBackground(Color.white);
	}
	else{
		si=0;
		lll.setBackground(Color.decode("0X6037BF"));
	
	}	
	}

if (e.getSource()==llll) {
	if (si==0){
	si=4;
    llll.setBackground(Color.white);
	}
	else{
		si=0;
		llll.setBackground(Color.decode("0X3202F4"));
	}
}
if (e.getSource()==lllll) {
	if (si==0){
	si=5;
    lllll.setBackground(Color.white);
}
else{
	si=0;
	lllll.setBackground(Color.decode("0X7D1349"));
}
}	
if (e.getSource()==llllll) {
	if (si==0){
	si=6;
    llllll.setBackground(Color.white);
	}
	else{
		si=0;
        llllll.setBackground(Color.decode("0X2D5464"));
	}
		
}
if (e.getSource()==lllllll) {
	if (si==0){
	si=7;
    lllllll.setBackground(Color.white);
	}
	else{
		si=0;
		lllllll.setBackground(Color.decode("0X124804"));
	}
}
if (e.getSource()==llllllll) {
	if (si==0){
	si=8;
    llllllll.setBackground(Color.white);
	}
	else{
		si=0;
        llllllll.setBackground(Color.decode("0X11130F"));
        
	}
}		
	
}
@Override
public void mousePressed(MouseEvent f) {
	if (f.getSource()==falta) {
		falta.setVisible(false);
	}
	if (f.getSource()==uno) {
		switch (si){
		case 1:
			 
			conta();
			base1.add(uu[2]);
			if (uu[0]==2)
				base2.remove(base2.size()-1);
			
			else
				base3.remove(base3.size()-1);
			uu[0]=1;
				b.setBounds(60,(260-(20*base1.size())), 80, 20);
			unos();
			
			break;
		case 2:
			if (base1.size()==0){
			conta();
			base1.add(dd[2]);
			if (dd[0]==2)
				base2.remove(base2.size()-1);
			
			else
				base3.remove(base3.size()-1);
			dd[0]=1;
				ll.setBounds(55,(260-(20*base1.size())), 90, 20);
			doss();
		}
		else{
			if (base1.get(base1.size()-1)>dd[2]){
				conta();
				base1.add(dd[2]);
				if (dd[0]==2)
					base2.remove(base2.size()-1);
				
				else
					base3.remove(base3.size()-1);
				dd[0]=1;		
					ll.setBounds(55,(260-(20*base1.size())), 90, 20);
				doss();
			}
			else{
				falta.setVisible(true);
			}
			
			
		}
			break;
		case 3:
			if (base1.size()==0){
			conta();
			base1.add(tt[2]);
			if (tt[0]==2)
				base2.remove(base2.size()-1);
			
			else
				base3.remove(base3.size()-1);
			tt[0]=1;
				lll.setBounds(50,(260-(20*base1.size())), 100, 20);
			tress();
		}
		else{
			if (base1.get(base1.size()-1)>tt[2]){
				conta();
				base1.add(tt[2]);
				if (tt[0]==2)
					base2.remove(base2.size()-1);
				
				else
					base3.remove(base3.size()-1);
				tt[0]=1;		
					lll.setBounds(50,(260-(20*base1.size())), 100, 20);
			tress();
			}
			else{
				falta.setVisible(true);
			}
		}
			break;
		case 4:
			if (base1.size()==0){
			conta();
			base1.add(cc[2]);
			if (cc[0]==2)
				base2.remove(base2.size()-1);
			
			else
				base3.remove(base3.size()-1);
			cc[0]=1;
				llll.setBounds(45,(260-(20*base1.size())), 110, 20);
			cuatros();
		}
		else{
			if (base1.get(base1.size()-1)>cc[2]){
				conta();
				base1.add(cc[2]);
				if (cc[0]==2)
					base2.remove(base2.size()-1);
				
				else
					base3.remove(base3.size()-1);
				cc[0]=1;		
				llll.setBounds(45,(260-(20*base1.size())), 110, 20);
				cuatros();
			}
			else{
				falta.setVisible(true);
			}
		}
			break;
		case 5:
			if (base1.size()==0){
			conta();
			base1.add(cq[2]);
			if (cq[0]==2)
				base2.remove(base2.size()-1);
			
			else
				base3.remove(base3.size()-1);
			cq[0]=1;
				lllll.setBounds(40,(260-(20*base1.size())), 120, 20);
			cincos();
		}
		else{
			if (base1.get(base1.size()-1)>cq[2]){
				conta();
				base1.add(cq[2]);
				if (cq[0]==2)
					base2.remove(base2.size()-1);
				
				else
					base3.remove(base3.size()-1);
				cq[0]=1;		
					lllll.setBounds(40,(260-(20*base1.size())), 120, 20);
				cincos();
			}
			else{
				falta.setVisible(true);
			}
		}
			break;
		case 6:
			if (base1.size()==0){
			conta();
			base1.add(ss[2]);
			if (ss[0]==2)
				base2.remove(base2.size()-1);
			
			else
				base3.remove(base3.size()-1);
			ss[0]=1;
				llllll.setBounds(35,(260-(20*base1.size())), 130, 20);
			seiss();
		}
		else{
			if (base1.get(base1.size()-1)>ss[2]){
				conta();
				base1.add(ss[2]);
				if (ss[0]==2)
					base2.remove(base2.size()-1);
				
				else
					base3.remove(base3.size()-1);
				ss[0]=1;		
					llllll.setBounds(35,(260-(20*base1.size())), 130, 20);
				seiss();
			}
			else{
				falta.setVisible(true);
			}
		}
			break;
		case 7:
			if (base1.size()==0){
			conta();
			base1.add(st[2]);
			if (st[0]==2)
				base2.remove(base2.size()-1);
			
			else
				base3.remove(base3.size()-1);
			st[0]=1;
				lllllll.setBounds(30,(260-(20*base1.size())), 140, 20);
			sietes();
		}
		else{
			if (base1.get(base1.size()-1)>st[2]){
				conta();
				base1.add(st[2]);
				if (st[0]==2)
					base2.remove(base2.size()-1);
				
				else
					base3.remove(base3.size()-1);
				st[0]=1;		
					lllllll.setBounds(30,(260-(20*base1.size())), 140, 20);
			sietes();
			}
			
		}
			break;
		case 8:
			if (base1.size()==0){
			conta();
			base1.add(oo[2]);
			if (oo[0]==2)
				base2.remove(base2.size()-1);
			
			else
				base3.remove(base3.size()-1);
			oo[0]=1;
				b.setBounds(25,(260-(20*base1.size())), 150, 20);
			ochos();
		}
		else{
			if (base1.get(base1.size()-1)>oo[2]){
				conta();
				base1.add(oo[2]);
				if (oo[0]==2)
					base2.remove(base2.size()-1);
				
				else
					base3.remove(base3.size()-1);
				oo[0]=1;		
					llllllll.setBounds(25,(260-(20*base1.size())), 150, 20);
				ochos();
			}
			else{
				falta.setVisible(true);
			}
		}
			break;
		default:
			break;
		}   
	}
	if (f.getSource()==dos) {
		switch (si){
		case 1:
			conta();
			base2.add(uu[2]);
			if (uu[0]==1)
				base1.remove(base1.size()-1);
			
			else
				base3.remove(base3.size()-1);
			uu[0]=2;
				b.setBounds(235,(260-(20*base2.size())), 80, 20);
			unos();
			if (base2.size()==cantidad){
				finalito();
			}
		
			break;
		case 2:	
			if (base2.size()==0){
				conta();
				base2.add(dd[2]);
				if (dd[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base3.remove(base3.size()-1);
				dd[0]=2;
					ll.setBounds(230,(260-(20*base2.size())), 90, 20);
				doss();
			}
			else{
				if (base2.get(base2.size()-1)>dd[2]){
					conta();
					base2.add(dd[2]);
					if (dd[0]==1)
						base1.remove(base1.size()-1);
					
					else
						base3.remove(base3.size()-1);
					dd[0]=2;		
						ll.setBounds(230,(260-(20*base2.size())), 90, 20);
					doss();
				}
				else{
					falta.setVisible(true);
				}
			}
			break;
		case 3:
			if (base2.size()==0){
				conta();
				base2.add(tt[2]);
				if (tt[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base3.remove(base3.size()-1);
					tt[0]=2;		
					lll.setBounds(225,(260-(20*base2.size())), 100, 20);
				tress();
			}
			else{
				if (base2.get(base2.size()-1)>tt[2]){
					conta();
					base2.add(tt[2]);
					if (tt[0]==1)
						base1.remove(base1.size()-1);
					
					else
						base3.remove(base3.size()-1);
					tt[0]=2;
						
						lll.setBounds(225,(260-(20*base2.size())), 100, 20);
					tress();
				}
				else{
					falta.setVisible(true);
				}
			}
			break;
		case 4:
			if (base2.size()==0){
			conta();
			base2.add(cc[2]);
			if (cc[0]==1)
				base1.remove(base1.size()-1);
			
			else
				base3.remove(base3.size()-1);
			cc[0]=2;
				llll.setBounds(220,(260-(20*base2.size())), 110, 20);
			cuatros();
		}
		else{
			if (base2.get(base2.size()-1)>cc[2]){
				conta();
				base2.add(cc[2]);
				if (cc[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base3.remove(base3.size()-1);
				cc[0]=2;		
				llll.setBounds(220,(260-(20*base2.size())), 110, 20);
				cuatros();
			}
			else{
				falta.setVisible(true);
			}	
		}
			break;
		case 5:	
			if (base2.size()==0){
				conta();
				base2.add(cq[2]);
				if (cq[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base3.remove(base3.size()-1);
				cq[0]=2;
					lllll.setBounds(215,(260-(20*base2.size())), 120, 20);
				cincos();
			}
			else{
				if (base2.get(base2.size()-1)>cq[2]){
					conta();
					base2.add(cq[2]);
					if (cq[0]==1)
						base1.remove(base1.size()-1);
					
					else
						base3.remove(base3.size()-1);
					cq[0]=2;		
						lllll.setBounds(215,(260-(20*base2.size())), 120, 20);
					cincos();
				}
				else{
					falta.setVisible(true);
				}
			}
			break;
		case 6:
			if (base2.size()==0){
				conta();
				base2.add(ss[2]);
				if (ss[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base3.remove(base3.size()-1);
					ss[0]=2;		
					llllll.setBounds(210,(260-(20*base2.size())), 130, 20);
				seiss();
			}
			else{
				if (base2.get(base2.size()-1)>ss[2]){
					conta();
					base2.add(ss[2]);
					if (ss[0]==1)
						base1.remove(base1.size()-1);
					
					else
						base3.remove(base3.size()-1);
					ss[0]=2;
						
						llllll.setBounds(210,(260-(20*base2.size())), 130, 20);
					seiss();
				}
				else{
					falta.setVisible(true);
				}
			}
			break;
		case 7:
			if (base2.size()==0){
			conta();
			base2.add(st[2]);
			if (st[0]==1)
				base1.remove(base1.size()-1);
			
			else
				base3.remove(base3.size()-1);
			st[0]=2;
				lllllll.setBounds(200,(260-(20*base2.size())), 140, 20);
			sietes();
		}
		else{
			if (base2.get(base2.size()-1)>st[2]){
				conta();
				base2.add(st[2]);
				if (st[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base3.remove(base3.size()-1);
				st[0]=2;		
					lllllll.setBounds(200,(260-(20*base2.size())), 140, 20);
				sietes();
			}
			else{
				falta.setVisible(true);
			}
		}
			break;
		case 8:	
			if (base2.size()==0){
				conta();
				base2.add(oo[2]);
				if (oo[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base3.remove(base3.size()-1);
				oo[0]=2;
					llllllll.setBounds(200,(260-(20*base2.size())), 150, 20);
				ochos();
			}
			else{
				if (base2.get(base2.size()-1)>oo[2]){
					conta();
					base2.add(oo[2]);
					if (oo[0]==1)
						base1.remove(base1.size()-1);
					
					else
						base3.remove(base3.size()-1);
					oo[0]=2;		
						llllllll.setBounds(200,(260-(20*base2.size())), 150, 20);
					ochos();
				}
				else{
					falta.setVisible(true);
				}
			}
			break;
		
		default:
			break;
		}
		}
	if (f.getSource()==tres) {
		switch (si){
		case 1:
				conta();
				base3.add(uu[2]);
				if (uu[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base2.remove(base2.size()-1);
				uu[0]=3;
					b.setBounds(410,(260-(20*base3.size())), 80, 20);
					unos();
					if (base3.size()==cantidad){
						finalito();
					}
			break;
		case 2:
			if (base3.size()==0){
				conta();
				base3.add(dd[2]);
				if (dd[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base2.remove(base2.size()-1);
				dd[0]=3;
					ll.setBounds(405,(260-(20*base3.size())), 90, 20);
				doss();
			}
			else{
				if (base3.get(base3.size()-1)>dd[2]){
					conta();
					base3.add(dd[2]);
					if (dd[0]==1)
						base1.remove(base1.size()-1);
					
					else
						base2.remove(base2.size()-1);
					dd[0]=3;		
						ll.setBounds(405,(260-(20*base3.size())), 90, 20);
					doss();
				}
				else{
					falta.setVisible(true);
				}
			}
			break;
		case 3:
			if (base3.size()==0){
				conta();
				base3.add(tt[2]);
				if (tt[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base2.remove(base2.size()-1);
					tt[0]=3;		
					lll.setBounds(400,(260-(20*base3.size())), 100, 20);
				tress();
			}
			else{
				if (base3.get(base3.size()-1)>tt[2]){
					conta();
					base3.add(tt[2]);
					if (tt[0]==1)
						base1.remove(base1.size()-1);
					
					else
						base2.remove(base2.size()-1);
					tt[0]=3;
						
						lll.setBounds(400,(260-(20*base3.size())), 100, 20);
					tress();
				}
				else{
					falta.setVisible(true);
				}
			}
		break;
		case 4:
			if (base3.size()==0){
				conta();
				base3.add(cc[2]);
				if (cc[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base2.remove(base2.size()-1);
				cc[0]=3;
					llll.setBounds(395,(260-(20*base3.size())), 110, 20);
					cuatros();
			}
			else{
				if (base3.get(base3.size()-1)>cc[2]){
					conta();
					base3.add(cc[2]);
					if (cc[0]==1)
						base1.remove(base1.size()-1);
					
					else
						base2.remove(base2.size()-1);
					cc[0]=3;		
						llll.setBounds(395,(260-(20*base3.size())), 110, 20);
					cuatros();
				}
				else{
					falta.setVisible(true);
				}
				
			}
			break;
		case 5:
			if (base3.size()==0){
				conta();
				base3.add(cq[2]);
				if (cq[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base2.remove(base2.size()-1);
					cq[0]=3;		
					lllll.setBounds(390,(260-(20*base3.size())), 120, 20);
				cincos();
			}
			else{
				if (base3.get(base3.size()-1)>cq[2]){
					conta();
					base3.add(cq[2]);
					if (cq[0]==1)
						base1.remove(base1.size()-1);
					
					else
						base2.remove(base2.size()-1);
					cq[0]=3;
						
						lllll.setBounds(390,(260-(20*base3.size())), 120, 20);
					cincos();
				}
				else{
					falta.setVisible(true);
				}
			}
			break;
		case 6:
			if (base3.size()==0){
				conta();
				base3.add(ss[2]);
				if (ss[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base2.remove(base2.size()-1);
				ss[0]=3;
					llllll.setBounds(385,(260-(20*base3.size())), 130, 20);
				seiss();
			}
			else{
				if (base3.get(base3.size()-1)>ss[2]){
					conta();
					base3.add(ss[2]);
					if (ss[0]==1)
						base1.remove(base1.size()-1);
					
					else
						base2.remove(base2.size()-1);
					ss[0]=3;		
						llllll.setBounds(385,(260-(20*base3.size())), 130, 20);
					seiss();
				}
				else{
					falta.setVisible(true);
				}
			}
			break;
		case 7:
			if (base3.size()==0){
				conta();
				base3.add(st[2]);
				if (st[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base2.remove(base2.size()-1);
					st[0]=3;		
					lllllll.setBounds(380,(260-(20*base3.size())), 140, 20);
			sietes();
			}
			else{
				if (base3.get(base3.size()-1)>st[2]){
					conta();
					base3.add(st[2]);
					if (st[0]==1)
						base1.remove(base1.size()-1);
					
					else
						base2.remove(base2.size()-1);
					st[0]=3;
						
						lllllll.setBounds(380,(260-(20*base3.size())), 140, 20);
				sietes();
				}
				else{
					falta.setVisible(true);
				}
			}
			break;
		case 8:
			if (base3.size()==0){
				conta();
				base3.add(oo[2]);
				if (oo[0]==1)
					base1.remove(base1.size()-1);
				
				else
					base2.remove(base2.size()-1);
				oo[0]=3;
					llllllll.setBounds(375,(260-(20*base3.size())), 150, 20);
				ochos();
			}
			else{
				if (base3.get(base3.size()-1)>oo[2]){
					conta();
					base3.add(oo[2]);
					if (oo[0]==1)
						base1.remove(base1.size()-1);
					
					else
						base2.remove(base2.size()-1);
					oo[0]=3;		
						llllllll.setBounds(375,(260-(20*base3.size())), 150, 20);
					ochos();
				}
				else{
					falta.setVisible(true);
				}
			}
			break;
		default:
			break;
		} 
		}
	
}
@Override
public void mouseClicked(MouseEvent f) {
}
@Override
public void mouseEntered(MouseEvent f) {	
}
@Override
public void mouseExited(MouseEvent f) {
}
@Override
public void mouseReleased(MouseEvent f) {	
}
}
