import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import bestWay.DbManager.DbManager;
import bestWay.object.ObjectController;
import bestWay.object.Object;
import bestWay.user.User;
import bestWay.user.UserController;

public class teste {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		  User user = new User();
		/* String query;
		query = "select * from user ";
		String users = null;
		DbManager dbm = new DbManager()*/;
		UserController uc = new UserController();
		ObjectController oc = new ObjectController();
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestwaydb","root","MAL18091998");
			System.out.println("Connected");               
			Statement statement = conn.createStatement();
			ResultSet result=statement.executeQuery(query);
			/* while(result.next()) {
				 for(int i=1 ; i<=3 ; i++) {
					 users = result.getString(i);
				 }
			 }
			
			while(result.next()) {
			user.setId(result.getInt(1));
		    user.setUserName(result.getString(2));
			user.setPassword(result.getString(3));
			}
			} catch (SQLException e) {
			e.printStackTrace();
			
		}*/
		
		/*try {
			ResultSet result=dbm.getResult(query);
			while(result.next()) {
				user.setId(result.getInt(1));
			    user.setUserName(result.getString(2));
				user.setPassword(result.getString(3));
		
				}
				} catch (SQLException e) {
				e.printStackTrace();}
		*/
		List<Object> objectlist = oc.getallObjects();
		
		for(Object objectaux : objectlist){
			 
			
		    System.out.println( objectaux.getUserId());
		    System.out.println( objectaux.getObjectName());
		    System.out.println( objectaux.getStatus());
		    System.out.println( objectaux.getUserId());
		    System.out.println( objectaux.getImage());
		    System.out.println( objectaux.getPrice());
		    System.out.println( objectaux.getAboutObject());
       
		
		    //System.out.println(objectlist.get(i));
		} 
          /*System.out.println( user.getId());
          System.out.println( user.getUserName());
          System.out.println( user.getPassword());*/
         
	}

}
