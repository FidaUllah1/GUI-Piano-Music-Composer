import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

public class ShowFrame extends JFrame {
	static JTextArea textarea;
	JScrollPane scroll;
	 
	public ShowFrame() {
		
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setSize(new Dimension(500,500));
	 this.setResizable(false);
	//this.pack();
	 
	 
	 
	    textarea=new JTextArea();
		textarea.setPreferredSize(new Dimension(450,6000));
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setFont(new Font("Arial",Font.PLAIN,20));
		textarea.setBackground(Color.black);
		textarea.setForeground(Color.yellow);
		
		
		
		scroll=new JScrollPane(textarea);
		scroll.setPreferredSize(new Dimension(450,450));
		
		
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.add(scroll);
		
	this.setVisible(true);
}
	public static void show(String notes) {
	
                            textarea.append(notes);
                           
                        
          
	} 

}
