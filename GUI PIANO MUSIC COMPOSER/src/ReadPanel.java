import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.SwingWorker;

public class ReadPanel extends SoundPanel {
    String notes;
   // ShowFrame f;
	public ReadPanel(String notes) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		super();
		this.notes=notes;
		// this.f=new ShowFrame();
		
	}
public void stringplay() throws InterruptedException {
		SwingWorker worker=new SwingWorker() {

			@Override
			protected Object doInBackground() throws Exception {
				// TODO Auto-generated method stub
				for(int m=0;m<notes.length();m++) {
					Thread.sleep(10);
					MyThread1 playstring=new MyThread1();
					switch(notes.charAt(m)) {
					case 'C':
						System.out.print("C");
						
						ShowFrame.show("C");
						playstring.run1(clipC);
						
						break;
					case 'D':
						System.out.print("D");
						ShowFrame.show("D");
						playstring.run1(clipD);
						break;
					case 'E':
						System.out.print("E");
						ShowFrame.show("E");
						playstring.run1(clipE);
						break;
					case 'F':
						System.out.print("F");
						ShowFrame.show("F");
						playstring.run1(clipF);
						break;
					case 'G':
						System.out.print("G");
						ShowFrame.show("G");
						playstring.run1(clipG);
						break;
					case 'A':
						System.out.print("A");
						ShowFrame.show("A");
						playstring.run1(clipA);
						break;
					case 'B':
						System.out.print("B");
						ShowFrame.show("B");
						playstring.run1(clipB);
						break;
					case 'c':
						System.out.print("c");
						ShowFrame.show("c");
						playstring.run1(clipC1);
						break;
					case 'd':
						System.out.print("d");
						ShowFrame.show("d");
						playstring.run1(clipD1);
						break;
					case 'f':
						System.out.print("f");
						ShowFrame.show("f");
						playstring.run1(clipF1);
						break;
					case 'g':
						System.out.print("g");
						ShowFrame.show("g");
						playstring.run1(clipG1);
						break;
					case 'a':
						System.out.print("a");
						ShowFrame.show("a");
						playstring.run1(clipA1);
						break;
					case '-':
						ShowFrame.show("-");
						playstring.sleep(0);
						System.out.println("-");
						break;
						
						
					
						
				
				
				}
				}

				return null;
			}
			
		};
		worker.execute();
		
}
}
