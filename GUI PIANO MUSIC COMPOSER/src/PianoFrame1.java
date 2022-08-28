import java.awt.Dimension;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

public class PianoFrame1 extends JFrame {
   public PianoFrame1() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	   this.add(new PianoPanel());
	   this.setPreferredSize(new Dimension(500,500));
	   this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
	   this.setResizable(false);
	   
	   this.pack();
	   this.setVisible(true);
   }


}
