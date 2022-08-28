import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Packet extends JFrame implements ActionListener {
	JButton piano;
    JButton compose;
   
    JLabel background;
   
    
	public Packet() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
		
		background=new JLabel(new ImageIcon("space.png"));
		
		background.setLayout(new FlowLayout());
		piano=new JButton("Piano");
		compose=new JButton("Compose");
		
		piano.addActionListener(this);
		compose.addActionListener(this);
		
		
		//p1=new Panel1();
		//p1.add(piano);
		//p1.add(compose);
		
		
		
		background.add(piano);
		background.add(compose);
		this.add(background);
		
		
		this.setVisible(true);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==piano) {
			try {
				new PianoFrame1();
				
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==compose) {
			new ComposeFrame();
			
			
		}
		
	}
}
