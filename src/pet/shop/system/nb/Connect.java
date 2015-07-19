package pet.shop.system.nb;

import javax.swing.*;
import java.sql.*;

/**
 * Created by User on 7/4/2015.
 */
public class Connect {
    Connect conn=null;
    ResultSet rs=null;
    PreparedStatement ps=null;

    public static Connection connectDB() {
        try{
            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\User\\Downloads\\Lecturer Slides\\Sem3\\OODJ\\Assignment\\Pet Shop System(NB)\\petshop.mdb");
            return conn;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
