 //generate choice with some event
 import java.awt.*;
 import java .awt.event.*;
 public class FrameDemo1 extends Frame implements ActionListener
 {
	 Button b1;
	 Label l1;
	 Choice ch;
	 public FrameDemo1()
	 {
		 this.setLayout(null);
		 this.setSize(500,500);
		 this.setTitle("my frame");
		 
		 Label l1=new Label();
		 l1.setBounds(100,50,100,30);
		 this.add(l1);
		  
		 Choice ch=new Choice();
		 ch.setBounds(50,100,100,30);
		 ch.add("s");
		 ch.add("h");
		 ch.add("w");
		 ch.add("e");
		 ch.add("t");
		 ch.add("a");
		 this.add(ch);
		 
		 Button b1=new Button("click");
		 b1.setBounds(50,150,200,30);
		 this.add(b1);
		 b1.addActionListener(this);
		 
		 this.setVisible(true);
		 this.addWindowListener(new WindowAdapter()
		 {
			 public void windowClosing(WindowEvent we)
			 {
				 setVisible(false);
				 System.exit(0);
			 }
		 });
	 }
	 public void actionPerformed(ActionEvent ae)
	 {
		 l1.setText(ch.getItem(ch.getSelectedIndex()));
	 }
	 public static void main(String[] args)
	 {
		 new FrameDemo1();
	 }
 }