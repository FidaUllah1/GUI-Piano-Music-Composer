import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ComposeFrame extends JFrame implements ActionListener {

	JTextArea textarea;
	JScrollPane scroll;
	JSpinner fontsize;
	JLabel fontname;
	JLabel background;
	JButton fontcolourbutton;
	JComboBox fontbox;
	JMenuBar menubar;
	JMenu filemenu;
	JMenuItem openitem;
	JMenuItem saveitem;
	JMenuItem exititem;
	JMenuItem play;
    JScrollBar sbar;
	
	public ComposeFrame() {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(new Dimension(500,500));
		this.setLayout(new BorderLayout());
		background=new JLabel(new ImageIcon("space.png"));
		background.setLayout(new FlowLayout());
		
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
		
		fontname=new JLabel("Font: ");
		
		fontsize=new JSpinner();
		fontsize.setPreferredSize(new Dimension(50,25));
		fontsize.setValue(20);
		fontsize.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				textarea.setFont(new Font(textarea.getFont().getFamily(),Font.PLAIN,(int)fontsize.getValue()));
			}
			
		});
		
		fontcolourbutton=new JButton("Colour");
		fontcolourbutton.addActionListener(this);
		
		String [] fonts=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		fontbox=new JComboBox(fonts);
		fontbox.addActionListener(this);
		fontbox.setSelectedItem("Arial");
		
		menubar=new JMenuBar();
		filemenu=new JMenu("File");
		openitem=new JMenuItem("Open");
		saveitem=new JMenuItem("Save");
		exititem=new JMenuItem("Exit");
		play=new JMenuItem("Play");
		
		
		openitem.addActionListener(this);
		saveitem.addActionListener(this);
		exititem.addActionListener(this);
		play.addActionListener(this);
		
		filemenu.add(openitem);
		filemenu.add(saveitem);
		filemenu.add(play);
		filemenu.add(exititem);
		menubar.add(filemenu);
		
		this.setJMenuBar(menubar);
		background.add(fontbox);
		background.add(fontcolourbutton);
		background.add(fontname);
		background.add(fontsize);
		background.add(scroll);
		
		
		this.add(background);
		this.setVisible(true);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==fontcolourbutton) {
			JColorChooser colorchooser=new JColorChooser();
			Color color=colorchooser.showDialog(null, "Choose Text Color ", Color.black);
			textarea.setForeground(color);
		}
		else if(e.getSource()==fontbox) {
			textarea.setFont(new Font((String)fontbox.getSelectedItem(),Font.PLAIN,textarea.getFont().getSize()));
		}
		else if(e.getSource()==openitem) {
			JFileChooser filechooser=new JFileChooser();
			filechooser.setCurrentDirectory(new File("."));
			int response=filechooser.showOpenDialog(null);
			if(response==JFileChooser.APPROVE_OPTION) {
				File file=new File(filechooser.getSelectedFile().getAbsolutePath());
				Scanner filein=null;
				try {
					 filein=new Scanner(file);
					 if(file.isFile()) {
						 while(filein.hasNextLine()) {
								String line=filein.nextLine()+"\n";
								textarea.append(line);
							}
					 }
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				finally {
					filein.close();
				}
				
			}
			
		}
		else if(e.getSource()==saveitem) {
			JFileChooser filechooser=new JFileChooser();
			filechooser.setCurrentDirectory(new File("."));
			int response=filechooser.showOpenDialog(null);
			if(response==JFileChooser.APPROVE_OPTION) {
				File file=new File(filechooser.getSelectedFile().getAbsolutePath());
				PrintWriter fileout=null;
				if(file.isFile()) {
					
					try {
						 fileout=new PrintWriter(file);
						fileout.write(textarea.getText());
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					finally {
						fileout.close();
					}
				}
			}
		}
		else if(e.getSource()==play) {
			String info=textarea.getText();
			new ShowFrame();
			try {
				ReadPanel read=new ReadPanel(info);
				read.stringplay();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==exititem) {
			
			this.dispose();
			
		}
		
	}
}
