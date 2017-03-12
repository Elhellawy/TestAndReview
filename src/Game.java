import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Game 
{
  JFrame form;
  JLabel q,label;
  JRadioButton a1, a2,a3,a4;
  ButtonGroup answer;
  Scanner file;
  String temp,array[],answers[] = {"2","12","56","9","3"};
  int index = 0,Score = 0;
  JButton Next;
  Game (String path)
  {
	  try 
	  {
	 file = new Scanner (new File (path));
	  temp = file.nextLine();
	  form = new JFrame("");
	  form.setSize(600,400);
 	  form.setLocation(0,0);
	  q = new JLabel(temp);
	  q.setSize(400,50);
	  q.setLocation(10,10);
	  form.add(q);
	  label = new JLabel();
	  label.setSize(200,50);
	  label.setLocation(300,200);
	  form.add(label);
	  temp = file.nextLine();
	  array = temp.split("\t");
	  answer = new ButtonGroup();
	  a1 = new JRadioButton(array[0]);
	  a1.setSize(50,30);
	  a1.setLocation(10,60);
	  answer.add(a1);
	  form.add(a1);
	  a2 = new JRadioButton(array[1]);
	  a2.setSize(50,30);
	  a2.setLocation(10,90);
	  answer.add(a2);
	  form.add(a2);
	  a3 = new JRadioButton(array[2]);
	  a3.setSize(50,30);
	  a3.setLocation(10,120);
	  answer.add(a3);
	  form.add(a3);
	  a4 = new JRadioButton(array[3]);
	  a4.setSize(50,30);
	  a4.setLocation(10,150);
	  answer.add(a4);
	  form.add(a4);
	  Next = new JButton("Next");
	  Next.setSize(100,50);
	  Next.setLocation(10, 200);
	  Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a1.isSelected())
				{
					if (a1.getText().equals(answers[index]))
					{
						label.setText("Right Answer");
						Score += 10;
						
					}
					else
					{
						label.setText("Wrong Answer");
					}
				}
				else if (a2.isSelected())
				{
					if (a2.getText().equals(answers[index]))
					{
						label.setText("Right Answer");
						Score += 10;
						
					}
					else
					{
						label.setText("Wrong Answer");
					}
				}
				else if (a3.isSelected())
				{
					if (a3.getText().equals(answers[index]))
					{
						label.setText("Right Answer");
						Score += 10;
						}
					else
					{
						label.setText("Wrong Answer");
					}
				}
				else if (a4.isSelected())
				{
					if (a4.getText().equals(answers[index]))
					{
						label.setText("Right Answer");
						Score += 10;
						}
					else
					{
						label.setText("Wrong Answer");
					}
				}
			
				if (file.hasNext())
				{
					
					a1.setSelected(false);
					a2.setSelected(false);
					a3.setSelected(false);
					a4.setSelected(false);
					index++;
					temp = file.nextLine();
					q.setText(temp);
					temp = file.nextLine();
					array = temp.split("\t");
					a1.setText(array[0]);
					a2.setText(array[1]);
					a3.setText(array[2]);
					a4.setText(array[3]);	
				}
				else
				{
					//Score = x;
					JOptionPane.showMessageDialog(null, "Finish your Score is " + Score, null, JOptionPane.PLAIN_MESSAGE);
					Next.setEnabled(false);
					//label.setText("Score: "+Score);
				}
			}
			});
	  form.add(Next);
 //	form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 form.setLayout(null);
	 form.setVisible(true);
	  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
}
