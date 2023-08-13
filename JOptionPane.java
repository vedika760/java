class Student
{
	String name;
	int rno;
	Student(String name, int rno)
	{
		this.name=name;
		this.rno=rno;
	}
	void display()
	{
		System.out.println("Name="+this.name+"\n"+"Roll no.="+this.rno);
	}
}
class JOptionPane
{
	public static void main(String[] args)
	{
		String name;
		int rno;
		name=javax.swing.JOptionPane.showInputDialog("Enter the name:");
		rno=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter the Roll number:"));
		Student st=new Student(name,rno);
		st.display();
	}
}