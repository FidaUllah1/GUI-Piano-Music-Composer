import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;

public class SoundPanel extends JPanel {

	Clip clipA;
	Clip clipB;
	Clip clipA1;
	Clip clipC;
	Clip clipC1;
	Clip clipD;
	Clip clipE;
	Clip clipD1;
	Clip clipF;
	Clip clipF1;
	Clip clipG;
	Clip clipG1;
	
	public SoundPanel() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File A=new File("piano-a_A_major.wav");
		File B=new File("piano-b_B_major.wav"); 
		File A1=new File("piano-bb_A#_major.wav"); 
		File C=new File("piano-c_C_major.wav"); 
		File C1=new File("piano-c_C#_major.wav"); 
		File D=new File("piano-d_D_major.wav"); 
		File E=new File("piano-e_E_major.wav"); 
		File D1=new File("piano-eb_D#_major.wav"); 
		File F=new File("piano-f_F_major.wav"); 
		File F1=new File("piano-f_F#_major.wav");
		File G=new File("piano-g_G_major.wav");
		File G1=new File("piano-g_G#_major.wav");
		AudioInputStream audioStreamA=AudioSystem.getAudioInputStream(A);
		AudioInputStream audioStreamB=AudioSystem.getAudioInputStream(B);
		AudioInputStream audioStreamC=AudioSystem.getAudioInputStream(C);
		AudioInputStream audioStreamC1=AudioSystem.getAudioInputStream(C1);
		AudioInputStream audioStreamD=AudioSystem.getAudioInputStream(D);
		AudioInputStream audioStreamE=AudioSystem.getAudioInputStream(E);
		AudioInputStream audioStreamD1=AudioSystem.getAudioInputStream(D1);
		AudioInputStream audioStreamA1=AudioSystem.getAudioInputStream(A1);
		AudioInputStream audioStreamF=AudioSystem.getAudioInputStream(F);
		AudioInputStream audioStreamF1=AudioSystem.getAudioInputStream(F1);
		AudioInputStream audioStreamG=AudioSystem.getAudioInputStream(G);
		AudioInputStream audioStreamG1=AudioSystem.getAudioInputStream(G1);
		 	 clipA=AudioSystem.getClip();
		 	 clipB=AudioSystem.getClip();		 
			 clipC=AudioSystem.getClip();
			 clipC1=AudioSystem.getClip();
			 clipD=AudioSystem.getClip();
			 clipE=AudioSystem.getClip();
			 clipD1=AudioSystem.getClip();
			 clipF=AudioSystem.getClip();
			 clipF1=AudioSystem.getClip();
			 clipG=AudioSystem.getClip();
			 clipG1=AudioSystem.getClip();
			 clipA1=AudioSystem.getClip();
		clipA.open(audioStreamA);
		clipB.open(audioStreamB);
		clipC.open(audioStreamC);
		 clipC1.open(audioStreamC1);
		 clipD.open(audioStreamD);
		 clipE.open(audioStreamE);
		 clipD1.open(audioStreamD1);
		 clipF.open(audioStreamF);
		 clipF1.open(audioStreamF1);
		 clipG.open(audioStreamG);
		 clipG1.open(audioStreamG1);
		 clipA1.open(audioStreamA1);
	}
}
