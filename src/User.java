import javax.swing.JFrame;
import javax.swing.JLabel;

public class User 
{
JFrame User_Form;
JLabel Name;
JLabel Gender;
JLabel Age;
JLabel Type;
JLabel namelabel,genderlabel,agelabel,typelabel;
User(String N,String G,String A,String T)
{
	User_Form = new JFrame("Profile");
	User_Form.setSize(300, 300);
	User_Form.setLocation(0,0);
	
	namelabel = new JLabel("Name: ");
	namelabel.setSize(50,30);
	namelabel.setLocation(10,10);
	User_Form.add(namelabel);
	
	Name = new JLabel(N);
	Name.setSize(150,30);
	Name.setLocation(60,10);
	User_Form.add(Name);
	
	genderlabel = new JLabel("Gender: ");
	genderlabel.setSize(50,30);
	genderlabel.setLocation(10,50);
	User_Form.add(genderlabel);
	
	Gender = new JLabel(G);
	Gender.setSize(150,30);
	Gender.setLocation(60,50);
	User_Form.add(Gender);
	
	agelabel = new JLabel("Age: ");
	agelabel.setSize(50,30);
	agelabel.setLocation(10,90);
	User_Form.add(agelabel);
	
	Age = new JLabel(A);
	Age.setSize(150,30);
	Age.setLocation(60,90);
	User_Form.add(Age);
	
	typelabel = new JLabel("Type: ");
	typelabel.setSize(50,30);
	typelabel.setLocation(10,140);
	User_Form.add(typelabel);
	
	Type = new JLabel(T);
	Type.setSize(150,30);
	Type.setLocation(60,140);
	User_Form.add(Type);
	
//	User_Form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	User_Form.setLayout(null);
	User_Form.setVisible(true);

}

void ViewProfile(String x, String y, String z)
{
	Name.setText(x);
	Gender.setText(y);
	Age.setText(z);
}
}
