import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javafx.scene.shape.Line;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TeacherTest {
	
	@Test
	public void Teacher()
	{
		
		
	}

  
  @Test
  public void createGame() throws IOException {
    Teacher teacher=new Teacher();
    ArrayList<String>game = new ArrayList<String>();
    game.add("game");
    teacher.createGame("MathQuiz", "MCQ",game );
    File f = null;
   
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("Category/"+"MCQ"+"/"+"MathQuiz"+ ".txt"))) {
    	line = br.readLine();   
    }   
    Assert.assertEquals(game.get(0), line);
  }
}
