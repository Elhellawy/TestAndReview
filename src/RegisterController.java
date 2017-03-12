import java.util.*;

import javax.swing.JOptionPane;

import java.io.*;
public class RegisterController {
	GameManager manager;
	public void signUp(String name, String Email,String password,String gender,String age, String type) throws IOException{
		 BufferedWriter p = new BufferedWriter(new FileWriter("Data/UserData.txt", true));
		
		 if(!Email.contains("@")){
			 JOptionPane.showMessageDialog(null, "Wrong format!", null, JOptionPane.PLAIN_MESSAGE);
				
		 }
		 try {
				Integer.parseInt(age);
			} catch (Exception e) {
				 JOptionPane.showMessageDialog(null, "Wrong format!", null, JOptionPane.PLAIN_MESSAGE);
				//e.printStackTrace();
			}
		
		 p.write(name+"-");
		 p.write(Email+"-");
		 p.write(password+"-");
		 p.write(gender+"-");
		 p.write(age+"-");
		 p.write(type);
		 p.newLine();
		 p.close();
		 JOptionPane.showMessageDialog(null, "Welcome " + name + " to our application", null, JOptionPane.PLAIN_MESSAGE);
			
	}
	public int signIn (String n, String l) throws FileNotFoundException{
		Scanner read = new Scanner(new File("Data/UserData.txt"));
		String s="";
		String[]array;
		while(read.hasNext())
		{
			s=read.nextLine();
			array=s.split("-");
			String name = array[0];
			String gender = array[3];
			String age = array[4];
			String type = array[5];
			if(array[1].equals(n))
			{
				if(array[2].equals(l))
				{
					manager = new GameManager(name,gender,age,type);
					if (array[5].equals("Student"))
					{
						manager.Create.setVisible(false);
						manager.Edit.setVisible(false);
						manager.Delete.setVisible(false);
					}
					read.close();
					return 2;
				}
				else
				{
					read.close();
					return 1;
				}					
			}
		}
		read.close();  
		return 0;
	  	
	}
	}
	


