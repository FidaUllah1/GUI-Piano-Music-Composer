import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

public class PianoPanel extends SoundPanel implements KeyListener {
	ImageIcon background;
	char c;
	int t=6;
  public PianoPanel() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		this.setPreferredSize(new Dimension(500,500));
		background=new ImageIcon("space.png");
		this.setBackground(Color.black);
		this.addKeyListener(this);
		this.setFocusable(true);
		
	}
  public void paintComponent(Graphics g) {
	  super.paintComponent(g);
	  g.drawImage(background.getImage(), 0, 0,  null);
	  g.drawLine(0, 500-25*5, 500, 500-25*5);
	  for(int a=1;a<=500/25;a++)
		  g.drawLine(25*a, 0, 25*a, 500);
	  g.setColor(new Color(255,240,31));
	  g.setFont(new Font("Ink Free",Font.BOLD,30));
	  FontMetrics metrics= getFontMetrics(g.getFont());
	    g.drawString("C",0, 500-25*4);
		g.drawString("D",25*2, 500-25*4);
		g.drawString("E",25*4, 500-25*4);
		g.drawString("F",25*6, 500-25*4);
		g.drawString("G",25*8, 500-25*4);
		g.drawString("A",25*10, 500-25*4);
		g.drawString("B",25*12, 500-25*4);
		g.drawString("C",25*14, 500-25*4);
		g.drawString("D",25*16, 500-25*4);
		g.drawString("E",25*18, 500-25*4);
		g.drawString("A",25*20, 500-25*4);
		
		g.drawString("c",25*1, 500-25*3);
		g.drawString("d",25*3, 500-25*3);
		g.drawString("f",25*5, 500-25*3);
		g.drawString("g",25*7, 500-25*3);
		g.drawString("a",25*9, 500-25*3);
		g.drawString("c",25*11, 500-25*3);
		g.drawString("d",25*13, 500-25*3);
		g.drawString("f",25*15, 500-25*3);
		g.drawString("g",25*17, 500-25*3);
		g.drawString("a",25*19, 500-25*3);
		g.setColor(new Color(255,240,31));
		switch(c) {
		case 'q':
			
			for(int r=6;r<=t;r++)
				g.fillRect(0, 500-25*r, 25, 25);
			
			t++;
			
			break;
		case 'w':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*2, 500-25*r, 25, 25);
			
			t++;
			
			break;
		case 'e':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*4, 500-25*r, 25, 25);
			
			t++;
			
			break;
		case 'r':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*6, 500-25*r, 25, 25);
			
			t++;
			
			break;
		case 't':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*8, 500-25*r, 25, 25);
			
			t++;
			
			break;
		case 'y':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*10, 500-25*r, 25, 25);
			
			t++;
			
			break;
		case 'u':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*12, 500-25*r, 25, 25);
			
			t++;
			
			break;
		case 'i':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*14, 500-25*r, 25, 25);
			
			t++;
			
			break;
		case 'o':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*16, 500-25*r, 25, 25);
			
			t++;
		
			break;
		case 'p':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*18, 500-25*r, 25, 25);
			
			t++;
		
			break;
		case '[':
			
			for(int r=6;r<=t;r++)
				g.fillRect(0, 500-25*r, 25, 25);
			
			t++;
			
			break;
		case 'a':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*1, 500-25*r, 25, 25);
		
			t++;
			
			break;
		case 's':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*3, 500-25*r, 25, 25);
		
			t++;
			
			break;
		case 'd':
		
			for(int r=6;r<=t;r++)
				g.fillRect(25*5, 500-25*r, 25, 25);
			
			t++;
			
			break;
		case 'f':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*7, 500-25*r, 25, 25);
			
			t++;
			
			break;
		case 'g':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*9, 500-25*r, 25, 25);
			
			t++;
		
			break;
		case 'h':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*11, 500-25*r, 25, 25);
		
			t++;
			
			break;
		case 'j':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*13, 500-25*r, 25, 25);
			
			t++;
			
			break;
		case 'k':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*15, 500-25*r, 25, 25);
			
			t++;
			
			break;
		case 'l':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*17, 500-25*r, 25, 25);
			
			t++;
		
			break;
		case ';':
			
			for(int r=6;r<=t;r++)
				g.fillRect(25*19, 500-25*r, 25, 25);
			
			t++;
			
			break;
			
		}
  }
  
@Override
public void keyTyped(KeyEvent e) {
	
	
}
@Override
public void keyPressed(KeyEvent e) {
	c=e.getKeyChar();
	if(c<='Z'&&c>='A') {
		c=Character.toLowerCase(c);
	}
	repaint();
	
			switch(e.getKeyChar()) {
			case 'q': 
				
				MyThread1 threadC=new MyThread1();
				threadC.run1(clipC);
				
			
				break;
			case 'w': 
				
				MyThread1 threadD=new MyThread1();
				threadD.run1(clipD);
				

			 
				break;
			case 'e': 
				
				MyThread1 threadE=new MyThread1();
				threadE.run1(clipE);
				

			   
				break;
			case 'r': 
				
				MyThread1 threadF=new MyThread1();
				threadF.run1(clipF);
				

			 
				break;
			case 't': 
				
				MyThread1 threadG=new MyThread1();
				threadG.run1(clipG);
				

			  
				break;
			case 'y': 
				
				MyThread1 threadA=new MyThread1();
				threadA.run1(clipA);
				

			
				break;
			case 'u': 
				
				MyThread1 threadB=new MyThread1();
				threadB.run1(clipB);
				

			
				break;
			case 'i': 
			
				MyThread1 threadCN=new MyThread1();
				threadCN.run1(clipC);
				

				break;
			case 'o': 
				System.out.println("jjs");
				MyThread1 threadDN=new MyThread1();
				threadDN.run1(clipD);
				

			case 'p': 
				
				MyThread1 threadEN=new MyThread1();
				threadEN.run1(clipE);
				

		
				break;
			case '[': 
			
				MyThread1 threadFN=new MyThread1();
				threadFN.run1(clipF);
				

				break;
			case 'a': 
			
				MyThread1 threadC1=new MyThread1();
				threadC1.run1(clipC1);
				

				break;
			case 's': 
				
				MyThread1 threadD1=new MyThread1();
				threadD1.run1(clipD1);
				


				break;
			case 'd': 
			
				MyThread1 threadF1=new MyThread1();
				threadF1.run1(clipF1);
				

			
				break;
			case 'f': 
			
				MyThread1 threadG1=new MyThread1();
				threadG1.run1(clipG1);
				

		
				break;
			case 'g': 
				
				MyThread1 threadA1=new MyThread1();
				threadA1.run1(clipA1);
				

			
				 
				break;
			case 'h': 
				
				MyThread1 threadC1N=new MyThread1();
				threadC1N.run1(clipC1);
				

		
				break;
			case 'j': 
				
				MyThread1 threadD1N=new MyThread1();
				threadD1N.run1(clipD1);
				

			
				break;
			case 'k': 
			
				MyThread1 threadF1N=new MyThread1();
				threadF1N.run1(clipF1);
				

			
				break;
			case 'l': 
				
				MyThread1 threadG1N=new MyThread1();
				threadG1N.run1(clipG1);
				

			
				break;
			case ';': 
			
				MyThread1 threadA1N=new MyThread1();
				threadA1N.run1(clipA1);
				

		
				 
				break;
			
			
				
			
				
			
			
		}
		
			
	
}
@Override
public void keyReleased(KeyEvent e) {
	t=6;
	c='x';
	repaint();
	
}

  
}
