package bestWay.object;

import java.sql.ResultSet;
import java.sql.Statement;

import bestWay.DbManager.DbManager;
import bestWay.user.User;

public class ObjectController {
	
	private String query;
	private ResultSet result;
	private Statement statement;
	private DbManager dbm =new DbManager();
	
	
public void insertObject(String objectname, String status, int userid, String image, float price ,String about) {
		
		query = "insert into object(objectname,status,userid,image,price,aboutobject) values('"+objectname+"','"+
		status+"','"+userid+"','"+image+"','"+price+"','"+about+"')"; 
			
		
				try{
					statement = dbm.getStatement();
					statement.executeUpdate(query);
					System.out.println("Object Insert");
					
				
				}catch (Exception e) {
					e.printStackTrace();
					System.out.println("Object not Insert");
				}	
							
			}

}
