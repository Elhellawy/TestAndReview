import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Category implements ActionListener 
{
String Name;
ArrayList<String> Games = new ArrayList<String>();
JFrame Category_form;
ArrayList<JButton> btns;
JButton btn;
Category (String n)
{
	Name = n;	
	if (n.equals("MCQ"))
	{
		Games.add("„‰ ”Ì—»Õ «·„·ÌÊ‰");
		Games.add("Math Quiz");
	}
	else if (n.equals("True or False"))
	{
		Games.add("History Quiz");
		Games.add("Science Quiz");
	}
}
Category ()
{
	Category_form = new JFrame ("Choose Game");
	Category_form.setSize(600, 400);
	Category_form.setLocation(0,0);
	
	int x = 20 , y = 20;
	for (int i = 0 ;i < Games.size();i++)
	{
		btn = new JButton(Games.get(i));
		btn.setSize(150,50);
		btn.setLocation(20, y);
		y+=55;
		btn.addActionListener(this);
		btns.add(btn);
		Category_form.add(btns.get(i));
	}
	
	Category_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Category_form.setLayout(null);
	Category_form.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	btn = (JButton) e.getSource();
	System.out.println("I'm " + btn.getText());
}
}
