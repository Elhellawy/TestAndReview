import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Teacher 
{
	JFrame form;
	TextField gameName;
	JComboBox gameCategory;
	JFileChooser filechooser;
	JButton Upload;
	File selectedfile;
	Scanner file;
	JLabel gamelabel,Categorylabel;
	ArrayList<String> gamename;
	String array[] = {"MCQ" , "True & False"};
	
    Teacher()
    {
    	 form = new JFrame("Create Game");
    	 form.setSize(600,150);
    	 form.setLocation(0,0);
    	 
    	 gamelabel = new JLabel("Game Name: ");
    	 gamelabel.setSize(100,30);
    	 gamelabel.setLocation(10, 10);
    	 form.add(gamelabel);
    	 
    	 gameName = new TextField();
    	 gameName.setSize(200,30);
    	 gameName.setLocation(120,10);
    	 form.add(gameName);
    	 
    	 Categorylabel = new JLabel("Category Name: ");
    	 Categorylabel.setSize(100,30);
    	 Categorylabel.setLocation(10, 50);
    	 form.add(Categorylabel);
    	 
    	 gameCategory = new JComboBox(array);
    	 gameCategory.setSize(200,30);
    	 gameCategory.setLocation(120,50);
    	 form.add(gameCategory);
    	 
    	 Upload = new JButton("Upload Game");
    	 Upload.setSize(200,30);
    	 Upload.setLocation(350,50);
    	 Upload.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					filechooser = new JFileChooser();
					int value = filechooser.showOpenDialog(null);
					if (value == JFileChooser.APPROVE_OPTION)
					{
						selectedfile = filechooser.getSelectedFile();
						try {
							file = new Scanner(new File (selectedfile.getPath()));
							gamename = new ArrayList<String>();
							while (file.hasNext())
							{
								gamename.add(file.nextLine());
							}
							JOptionPane.showMessageDialog(null, "Wait for approval", null, JOptionPane.PLAIN_MESSAGE);
							
							file.close();
							System.out.println(gameCategory.getSelectedItem().toString());
							createGame(gameName.getText(),gameCategory.getSelectedItem().toString(),gamename);
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				});
    	 form.add(Upload);
    	 
    	// form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 form.setLayout(null);
    	 form.setVisible(true);	
    }
    public void createGame (String gamename, String categoryname, ArrayList<String> game)
    {
   	  try
   	  {
			PrintStream file = new PrintStream("Category/"+categoryname+"/"+gamename+ ".txt");
			for (int i=0; i < game.size();i++)
			{
				file.println(game.get(i));
			}
			
			file.close();
   	  }
   	  catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
   		//e.printStackTrace();
   		  return;
			
		}  
    }
}
