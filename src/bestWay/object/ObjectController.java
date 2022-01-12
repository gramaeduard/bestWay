package bestWay.object;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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


public List <Object> getallObjects() {

	String string = "forsale";
	query = "select * from object where status='"+string+"'";
	List<Object> objectlist = new ArrayList<Object>();
	try{
		result = dbm.getResult(query);
		
		objectlist.clear();
		while(result.next()) {
			Object object = new Object();
		    object.setObjectId(result.getInt(1));
		    object.setObjectName(result.getString(2));
			object.setStatus(result.getString(3));
			object.setUserId(result.getInt(4));
			object.setImage(result.getString(5));
			object.setPrice(result.getFloat(6));
			object.setAboutObject(result.getString(7));
			
			objectlist.add(object);
		}
			return objectlist;
	}	catch (Exception e) {
		e.printStackTrace();
		return null;
	}	
		}


}
