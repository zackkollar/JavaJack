import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class startWindow implements ActionListener
{

	public startWindow()
	{
		JFrame title = new JFrame("Screen Title");
		title.setVisible(true);
		title.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		title.setSize(800, 600);
		title.setResizable(true);
		
		JButton begin = new JButton();
		begin.setBounds(3, 5, 15, 15);
		
		engine eng = new engine();
		title.setContentPane(eng);
		title.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
