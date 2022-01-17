package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import bestWay.user.UserController;

public class Authentication {

	@Test
	public void TestAuthentificatio() {
		UserController uc = new UserController();
		
		 String user = "PETRACHE Poenaruu";
		 String password = "PETRI12345";
		 assertEquals("Mesaj de validare",true,uc.isvalid(user, password)); 
	}

}
