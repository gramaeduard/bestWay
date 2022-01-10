package bestWay.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import bestWay.DbManager.DbManager;


public class UserController {

	/**query string use to interogate databases */

	private String query;
	private ResultSet result;
	private DbManager dbm =new DbManager();
	
	
	public User getuserbyid(String userid) {

		query = "select * from user where iduser='"+userid+"'";
		
		try{
			result = dbm.getResult(query);
			User user = new User();
			
			while(result.next()) {
		
			    user.setId(result.getInt(1));
			    user.setUserName(result.getString(2));
				user.setPassword(result.getString(3));
				
			}
				return user;
		}	catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
			}
	
	
	
	public boolean isvalid(String UserName, String Password) {
		
query = "select * from user where username='"+UserName+"'";
	
User user = new User();
		try{
			result = dbm.getResult(query);
			
			
			while(result.next()) {
		
			    user.setId(result.getInt(1));
			    user.setUserName(result.getString(2));
				user.setPassword(result.getString(3));
				
			}
		
		}catch (Exception e) {
			e.printStackTrace();
			}
		if( user.getPassword()==Password) {
			return true;
	}else return false;
					
	}
	
	
	
	
}
