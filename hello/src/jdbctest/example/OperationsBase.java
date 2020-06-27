package jdbctest.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Statement;
import java.util.Properties;

public class OperationsBase {

    protected static Properties props;
    protected Statement stmt = null;

    public OperationsBase (){

        props = new Properties();
        FileInputStream in = null;

        try {
            in = new FileInputStream("./src/jdbctest/database.properties");
            props.load(in);
            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
