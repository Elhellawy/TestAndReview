import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class GUI 
{
	JFrame LoginForm;
	TextField UserName;
	TextField Password;
	JButton SignUp;
	JButton SignIn;
	JLabel Name; 
	JLabel Pass;
	JLabel NewName; 
	JLabel NewPass;
	JLabel NewUser;
	JLabel Gender;
	JLabel N;
	JLabel age;
	TextField newUserName;
	TextField newPassword;
	TextField newName;
	TextField UserAge;
	String WrittenName;
	String WrittenPassword;
	JRadioButton Male;
	JRadioButton FeMale;
	JRadioButton Teacher;
	JRadioButton Student;
    ButtonGroup gen;
    ButtonGroup Type;
    JLabel type;
	String array[];
	GameManager G;
	RegisterController R;
	String one, two, three, four, five, six;
	

	
	GUI()
	{
		array = new String[2];
		array[0] = "Male"; array[1] = "female";
		
		LoginForm = new JFrame("Login");
		LoginForm.setSize(600, 600);
		LoginForm.setLocation(0,0);
		
		UserName = new TextField ();
		UserName.setSize(150,30);
		UserName.setLocation(100,20);
		LoginForm.add(UserName);
		
		Password = new TextField ();
		Password.setSize(150,30);
		Password.setLocation(100,70);
		LoginForm.add(Password);
		
		Name = new JLabel("Email");
		Name.setSize(100,30);
		Name.setLocation(10,20);
		LoginForm.add(Name);
		
		Pass = new JLabel("Password");
		Pass.setSize(100,30);
		Pass.setLocation(10,70);
		LoginForm.add(Pass);
		
		NewUser = new JLabel("Don't have an account?");
		NewUser.setSize(150,30);
		NewUser.setLocation(10,170);
		LoginForm.add(NewUser);
		
		N = new JLabel("Name");
		N.setSize(40,30);
		N.setLocation(10,200);
		LoginForm.add(N);
		
		newName =  new TextField();
		newName.setSize(150,30);
		newName.setLocation(100,200);
		LoginForm.add(newName);
		
		NewName = new JLabel("Email");
		NewName.setSize(80,30);
		NewName.setLocation(10,240);
		LoginForm.add(NewName);
		
		NewPass = new JLabel("Password");
		NewPass.setSize(80,30);
		NewPass.setLocation(10,280);
		LoginForm.add(NewPass);
		
		newUserName = new TextField();
		newUserName.setSize(150,30);
		newUserName.setLocation(100,240);
		LoginForm.add(newUserName);
		
		newPassword = new TextField();
		newPassword.setSize(150,30);
		newPassword.setLocation(100,280);
		newPassword.setEditable(true);
		LoginForm.add(newPassword);
		
		SignIn = new JButton("Sign In");
		SignIn.setSize(100,30);
		SignIn.setLocation(150,120);
		LoginForm.add(SignIn);
		
		Gender = new JLabel("Gender");
		Gender.setSize(100,30);
		Gender.setLocation(10,320);
		LoginForm.add(Gender);
		
		Male = new JRadioButton("Male");
		Male.setSelected(true);
		Male.setSize(100,30);
		Male.setLocation(100,320);
		LoginForm.add(Male);
		
		FeMale = new JRadioButton("Female");
		FeMale.setSize(100,30);
		FeMale.setLocation(100,340);
		LoginForm.add(FeMale);	
		
		age = new JLabel("Age");
		age.setSize(50,30);
		age.setLocation(10,380);
		LoginForm.add(age);	
		
		UserAge = new TextField(); 
		UserAge.setSize(100,30);
		UserAge.setLocation(100,380);
		LoginForm.add(UserAge);
		
		
		gen = new ButtonGroup();
		gen.add(Male);
		gen.add(FeMale);
		
		type = new JLabel("Choose Type");
		type.setSize(80,30);
		type.setLocation(10,420);
		LoginForm.add(type);
		
		Teacher = new JRadioButton("Teacher");
		Teacher.setSize(80,30);
		Teacher.setLocation(10,450);
		LoginForm.add(Teacher);
		
		Student = new JRadioButton("Student");
		Student.setSize(80,30);
		Student.setLocation(10,480);
		LoginForm.add(Student);
		
		Type = new ButtonGroup();
		Type.add(Teacher);
		Type.add(Student);
		
		SignUp = new JButton("Sign up");
		SignUp.setSize(100,30);
		SignUp.setLocation(100,520);
		LoginForm.add(SignUp);

		R = new RegisterController();
		 SignIn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String email = UserName.getText();
				String pass = Password.getText();
				try {
					int returnn = R.signIn(email, pass);
					if (returnn == 0) {UserName.setText("Wrong Email");}
					else if (returnn == 1) {Password.setText("Wrong Password");}
					else {LoginForm.setVisible(false);}
				}
				catch (FileNotFoundException e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}});
		
		
		 SignUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					one =  newName.getText();
					two =  newUserName.getText();
					three = newPassword.getText();
					four = UserAge.getText();
					
					try {
						if (Male.isSelected()){five = "Male";}
						else if (FeMale.isSelected()){five = "Female";}
						if (Teacher.isSelected()){six = "Teacher";}
						else if (Student.isSelected()){six = "Student";}
						R.signUp(one,two,three,five,four,six);
					} catch (Exception h) {
						// TODO Auto-generated catch block
						 JOptionPane.showMessageDialog(null, "Error!", null, JOptionPane.PLAIN_MESSAGE);
							
					}         
				}});
		 
		LoginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginForm.setLayout(null);
		LoginForm.setVisible(true);	
	}
	
	 

	
   public static void main(String args[])
   {
	   GUI x = new GUI();
   }
   
   
}
