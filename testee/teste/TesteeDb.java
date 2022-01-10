package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import bestWay.user.User;
import bestWay.user.UserController;

public class TesteeDb {


	 @Test
	 public void testExtractUser() {
	 User user = new User();
	 user.setId(1);
	 user.setUserName("PETRACHE Poenaruu");
	 user.setPassword("PETRI12345");
	 UserController uc = new UserController();
	 //User userdb=uc.getuserbyid("1");
	// String test =uc.getuserbyid("1").getUserName();
	 String str1 = "PETRACHE Poenaruu";
	 String str2 = "PETRACHE Poenaruu";
	 assertEquals("Mesaj de validare",0,str1.compareTo(str2)); 
	 }

}
