package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import bestWay.object.ObjectController;
import bestWay.user.User;
import bestWay.user.UserController;

public class TesteeDb {


	 @Test
	 public void testExtractUser() {
	 User user = new User();
	/* user.setId(1);
	 user.setUserName("PETRACHE Poenaruu");
	 user.setPassword("PETRI12345");*/
	 UserController uc = new UserController();
	 //User userdb=uc.getuserbyid("1");
	// String test =uc.getuserbyid("1").getUserName();
	 String str1 = "PETRACHE Poenaruu";
	 String str2 = uc.getuserbyid("1").getUserName();
	 assertEquals("Mesaj de validare",0,str1.compareTo(str2)); 
	 }
	 
	 @Test
	 public void testExtractObject() {
	   /*User user = new User();
		 user.setId(1);
		 user.setUserName("Eduard");
		 user.setPassword("PETRI12345");*/
		 ObjectController uc = new ObjectController();
		 //User userdb=uc.getuserbyid("1");
		// String test =uc.getuserbyid("1").getUserName();
		 String str1 = "FirstObject";
		 String str2 = uc.getobjectbyid("11").getObjectName();
		 assertEquals("Mesaj de validare",0,str1.compareTo(str2)); 
		 }

}
