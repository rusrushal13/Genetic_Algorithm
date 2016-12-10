/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseConnectivity;
/**
 *
 * @author rushal & ravi
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Update {
    public static void Update1(String password, String username) throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "rushal")) {
            System.out.println(con.toString());
            String query = "UPDATE student set password =  "+password +" where username = "+ username;
            System.out.println("Query :" + query);
            Statement st = con.createStatement();
            int val = st.executeUpdate(query);// returns zero when the result is empty else no. of rows
            System.out.println("1 row affected");
        }
    }
}