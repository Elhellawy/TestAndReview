import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameManager 
{
	 JFrame form;
     JButton viewProfile;
     JButton viewNotification;
     JLabel gameCategories;
     JLabel MCQ;
     JLabel TrueFalse;
     JButton game1;
     JButton game2;
     JButton game3;
     JButton game4;
     JButton Create;
     JButton Edit;
     JButton Delete;
     JButton Logout;
     GameManager(String Name,String Gender, String Age,String type)
     {
    	 form = new JFrame("PlayZone");
    	 form.setSize(600,400);
    	 form.setLocation(0,0);
    	 
    	 viewProfile = new JButton("View Profile");
    	 viewProfile.setSize(150,30);
    	 viewProfile.setLocation(5,5);
    	 viewProfile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//form.setVisible(false);
					User u = new User(Name,Gender,Age,type);
				}
				});
    	 form.add(viewProfile);
    	 
    	 viewNotification = new JButton("View Notification");
    	 viewNotification.setSize(150,30);
    	 viewNotification.setLocation(200,5);
    	 form.add(viewNotification);
    	 
    	 Logout = new JButton("Logout");
    	 Logout.setSize(150,30);
    	 Logout.setLocation(400,5);
    	 Logout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					form.setVisible(false);
					new GUI().LoginForm.setVisible(true);
				}
				});
    	 form.add(Logout);
    	 
    	 gameCategories = new JLabel("Categories:");
    	 gameCategories.setSize(150,30);
    	 gameCategories.setLocation(10,50);
    	 form.add(gameCategories);
    	 
    	 MCQ = new JLabel ("MCQ");
    	 MCQ.setSize(40,30);
    	 MCQ.setLocation(10,80);
    	 form.add(MCQ);
    	 
    	 game1 = new JButton("من سيربح الميليون");
    	 game1.setSize(150,30);
    	 game1.setLocation(10,120);
    	 form.add(game1);
    	 
    	 game2 = new JButton("Math Quiz");
    	 game2.setSize(150,30);
    	 game2.setLocation(10,160);
    	 game2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Game g = new Game("Category/MCQ/MathQuiz.txt");
					
				}
				});
    	 form.add(game2);
    	 
    	 TrueFalse = new JLabel("True & False");
    	 TrueFalse.setSize(100,30);
    	 TrueFalse.setLocation(10,200);
    	 
    	 form.add(TrueFalse);
    	 
    	 game3 = new JButton("History Quiz");
    	 game3.setSize(150,30);
    	 game3.setLocation(10,240);
    	 form.add(game3);
    	 
    	 game4 = new JButton("Science Quiz");
    	 game4.setSize(150,30);
    	 game4.setLocation(10,280);
    	 form.add(game4);
    	 
    	 Create = new JButton("Create Game");
    	 Create.setSize(150,30);
    	 Create.setLocation(400, 50);
    	 Create.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Teacher t = new Teacher();
				}
				});
    	 form.add(Create);
    	 
    	 Edit = new JButton("Edit Game");
    	 Edit.setSize(150,30);
    	 Edit.setLocation(400, 100);
    	// Edit.setVisible(false);
    	 form.add(Edit);
    	 
    	 Delete = new JButton("Delete Game");
    	 Delete.setSize(150,30);
    	 Delete.setLocation(400, 150);
    	// Delete.setVisible(false);
    	 form.add(Delete);
    	 
    	 viewNotification = new JButton();
    	 form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 form.setLayout(null);
    	 form.setVisible(true);	
     }
     
    
}
     