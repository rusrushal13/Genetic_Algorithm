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
import java.util.logging.Level;
import java.util.logging.Logger;
public class Insert {

    /**
     *
     * @param args
     * @param username
     * @param password
     * @param name
     * @param email
     * @throws Exception
     */
    public static void Insert1(String username, String password, String name, String email) throws Exception {
        String driver = "com.mysql.jdbc.Driver";
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            }
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "rushal")) {
            System.out.println(con.toString());
            String query = "INSERT into student VALUES(" + "\"" + username + "\"" + "," + "\"" + password + "\"" + "," + "\"" + name + "\"" + "," + "\"" + email + "\"" + ");";
            System.out.println("Query :" + query);
            Statement st = con.createStatement();
            int val = st.executeUpdate(query);
            System.out.println("1 row affected");
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public void Insert1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}