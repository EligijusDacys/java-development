package jdbctest.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Oracle java8 page
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryOperation extends OperationsBase {

    public void queryOperation() {

        System.out.println( super.props );

        String drivers = props.getProperty("jdbc.drivers");
        if (drivers != null) System.setProperty( "jdbc.drivers", drivers );

        String url = props.getProperty("jdbc.url");
        String user = props.getProperty("jdbc.username");
        String pass = props.getProperty("jdbc.password");

        Connection conn = null;
        try {
             conn =
                    DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, name, email, country FROM user");
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                System.out.println(id + ", " + name + ", " + email + ", " + country);
            }
        }catch (SQLException ex){


            ex.printStackTrace();
        }


    }
}
