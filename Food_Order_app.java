import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Food_Order_app {
	
	static final String DB_url="jdbc:mysql://localhost:3306/cognidemo";
	static final String user="root";
	static final String password="root";

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ch;
			System.out.println("1.Loig in");
			System.out.println("2.SignUp");
			System.out.println("please select either 1 or 2");
			ch=s.nextInt();
			
			switch(ch) {
			case 1:try(Connection con=DriverManager.getConnection(DB_url, user, password);
					   PreparedStatement ps=con.prepareStatement("select * from foodorder where user_name=? and password=?;");){
				   //Scanner s=new Scanner(System.in);
				   
				   System.out.println("enter username id");
				   String user_name=s.next();
				   System.out.println("enter password");
				   String password=s.next();
				   
				   ps.setString(1, user_name);
				   ps.setString(2, password);
				   
				   ResultSet rs=ps.executeQuery();
				   if(rs.next()) {
					   System.out.println("login successfully");
				   }
				   else {
					   System.out.println("login failed");
				   }
				   orderingFood fo = new orderingFood();

			        fo.displayMenu();

			        fo.order();
				   
			   }catch(SQLException e) {
				   e.printStackTrace();
			   }
			break;
			case 2: try(Connection con=DriverManager.getConnection(DB_url, user, password);
					   PreparedStatement ps=con.prepareStatement("insert into foodorder (user_name,password) values (?,?)");){
				   //Scanner s=new Scanner(System.in);
				   
				   System.out.println("enter username");
				   String user_name=s.next();
				   System.out.println("enter password");
				   String password=s.next();
				   
				   ps.setString(1, user_name);
				   ps.setString(2, password);
				   
				   ps.executeUpdate();
				   System.out.println("Thanks for signing up");
				   
			   }catch(SQLException e) {
				   e.printStackTrace();
			   }
			 break;
			} 	

	}

}
