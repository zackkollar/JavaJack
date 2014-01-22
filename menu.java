import javax.swing.*;
import java.awt.*;

public class menu extends JPanel{

	public menu(engine e)
	{
		
	}
	
	public void render(Graphics g)
	{
		Font menuFont = new Font(Font.SANS_SERIF, Font.BOLD, 72);
		g.setColor(Color.PINK);
		g.setFont(menuFont);
		g.drawString("JavaJack Alpha", 125, 50);
		Font menuFont2 = new Font(Font.SERIF, Font.ITALIC, 54);
		g.setFont(menuFont2);
		g.drawString("By Elliot O'Reilly", 175, 100);
	}
}
