package jdbctest.example;

import java.sql.*;

public class CommandOperation extends TransactionBase {

    public CommandOperation() {
    }

    public int selectOperation(String selectName){
        try{
            if(stmt != null) {
                //SELECT
                ResultSet rs = stmt.executeQuery("SELECT id, name, email, country FROM user WHERE name = '" + selectName + "'");
                boolean next = rs.next();
                if(next) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    String country = rs.getString("country");
                    System.out.println( String.format( "SELECT [%d, %s, %s, %s] ", id, name, email, country));
                    return id;
                }else{
                    return -1;
                }
            }else{
                return -1;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }

    public void insertOperation(String name, String email, String country){
        try{
            if(stmt != null) {
                //INSERT
                int ret = stmt.executeUpdate("INSERT user(name, email, country) VALUES " +
                        "('" + name + "', '" + email + "', '" + country + "')");
                System.out.println( String.format( "Insert [%s, %s, %s] return: ",
                        name, email, country ) + (ret == 1 ? "OK" : "ERROR"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    private void updateOperation(int id, String name, String email, String country){
        try{
            if(stmt != null) {
                //UPDATE
                int ret = stmt.executeUpdate("UPDATE user SET name = '" + name + "', " +
                        "email = '" + email + "', country = '" + country + "' WHERE id = " + id);
                System.out.println( String.format( "Update [%s, %s, %s] return: ",
                        name, email, country ) + (ret == 1 ? "OK" : "ERROR"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void deleteOperation(int id){
        try{
            if(stmt != null) {
                //DELETE
                int ret = stmt.executeUpdate("DELETE FROM user WHERE id = " + id);
                System.out.println("Delete return: " + (ret == 1 ? "OK" : "ERROR"));
                System.out.println( String.format( "Delete [%d] return: ", id ) +
                        (ret == 1 ? "OK" : "ERROR"));

            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static void commandOperation() {
        CommandOperation command = new CommandOperation();
        command.insertOperation("test1", "test1@test.com", "Poland");
        int id = command.selectOperation("test1");
        command.updateOperation(id, "test2", "test2@test.com", "Poland");
        id = command.selectOperation("test2");
        command.deleteOperation(id);
    }
}
