package hui;

import java.awt.BorderLayout;


import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

import java.lang.reflect.Method;
public class main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		JFrame frame = new JFrame(); //creates a frame 
		frame.setTitle("JFrame Title BRO"); //sets Titlew for the frame
		frame.setVisible(true); // make frame visible
		frame.setSize(500,500); // sets the x-direction, and y-direction of application
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
	
		frame.setResizable(true); //Prevents Resizing window
		
		//change the icon in the upper left right 
		ImageIcon img = new ImageIcon("exe_logo.png"); //create ImageIcon
		frame.setIconImage(img.getImage()); // Change icon of frame 
		
		frame.getContentPane().setBackground(Color.decode("#b1d3c8")); //Change color of background
		
		
		
		JToolBar toolBar= new JToolBar();
		JButton fileButton = new JButton("File");
		JButton editButton = new JButton("Edit");
		JButton sourceButton = new JButton("Source");
		toolBar.add(fileButton);
		toolBar.add(editButton);
		toolBar.add(sourceButton);
		fileButton.setBorder(BorderFactory.createEmptyBorder());
		editButton.setBorder(BorderFactory.createEmptyBorder());
		sourceButton.setBorder(BorderFactory.createEmptyBorder());
		toolBar.setBorder(BorderFactory.createEmptyBorder());
		frame.add(toolBar, BorderLayout.NORTH);
		
		//JOptionPane message = new JOptionPane();
		//message.showMessageDialog(null, "MESSAGE", "TITLE", 1, null);
		
		//JOptionPane.showInputDialog("Enter a number: ");
		
		Object options[] = {"SAVE", "EDIT", "CLOSE", "Another"};
		JOptionPane msg = new JOptionPane();
		String code = "#ff4ffe";
		msg.setBorder(BorderFactory.createEmptyBorder());
		msg.showOptionDialog(null,"CHOOSE", "Options", 1, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		msg.setBackground(Color.decode(code));
		
		int response = JOptionPane.showConfirmDialog(null, "CONTINUE? ", "Q",JOptionPane.YES_NO_OPTION);
		
		if(response == JOptionPane.YES_OPTION) JOptionPane.showMessageDialog(null, "You will Continue");
		else JOptionPane.showMessageDialog(null, "NOOOO", "NO", 0); 
		
		
		String p = "Name: Nancy; gerry: Gamer";
		String[] rule = p.split(";");
		for(String rul : rule) {
			String[] parts = rul.split(":");
			if(parts.length == 2) {
				String property = parts[0].trim();
				String value = parts[1].trim();
				
				}
		}
		prnt("Enter");
		
		
	}
	
	static void prnt(Object prnt) {
		System.out.print(prnt);
	}

}


