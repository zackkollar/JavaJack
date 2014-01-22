import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;


public class engine extends JPanel{

	private boolean menu = true, game = false;
	private menu menuScreen = new menu(this);
	
	
	public engine()
	{
		initGraphics();
	}
	
	private void initGraphics()
	{
		setPreferredSize(new Dimension(800, 600));
	}
	
	public void paintComponent(Graphics g)
	{
		if(menu == true)
		{
		super.paintComponent(g);
		menuScreen.render(g);
		}
	}
}
