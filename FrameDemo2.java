//change frame backgroud color on scrollbar Red, green, blue.
import java.awt.*;
import java.awt.event.*;

class FrameDemo2 extends Frame implements AdjustmentListener
{
	Scrollbar red,green,blue;
	FrameDemo2()
	{
		red = new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
		red.setBounds(30,30,30,100);
		this.add(red);
		red.addAdjustmentListener(this);
		
		green = new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
		green.setBounds(80,30,30,100);
		this.add(green);
		green.addAdjustmentListener(this);
		
		blue = new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
		blue.setBounds(130,30,30,100);
		this.add(blue);
		blue.addAdjustmentListener(this);
		
		this.setTitle("Scrollbar");
		this.setLayout(null);
		this.setSize(400,400);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
				setVisible(false);
			}
		});
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		int r = red.getValue();
		int g = green.getValue();
		int b = blue.getValue();
		setBackground(new Color(r,g,b));
	}
	public static void main(String [] args)
	{
		new FrameDemo2();
	}
}