import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterControllerTest {

  @Test
  public void signIn() throws FileNotFoundException {
	  RegisterController registerControllerObject=new RegisterController();
	  Assert.assertEquals(2, registerControllerObject.signIn("email", "password"));
	  Assert.assertEquals(0, registerControllerObject.signIn("notRegisterd", "NotRegisterd"));
  }

  @Test
  public void signUp() throws IOException {
  
	  RegisterController registerControllerObject=new RegisterController();
	  registerControllerObject.signUp("name", "email", "password", "male", "age", "student");
	  String FileRow="name"+"-"+"email"+"-"+"password"+"-"+"male"+"-"+"age"+"-"+"student";
	  String line="";
	  try (BufferedReader br = new BufferedReader(new FileReader("Data/UserData.txt"))) {
	        while ((line = br.readLine()) != null) {
	         if(line.equals(FileRow))
	         {
	        	 break;
	         }
	        }
	    }
	  Assert.assertEquals(false, line.equals(FileRow));
  }
  
}
