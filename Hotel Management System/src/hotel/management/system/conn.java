/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;





import java.sql.*;

public class conn {
    public Connection con;
    public  Statement s;

    public conn() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmange", "root", "super");
            s = con.createStatement();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }


}


