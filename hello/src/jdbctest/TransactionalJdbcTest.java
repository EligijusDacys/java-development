package jdbctest;

import jdbctest.example.*;

import java.sql.SQLException;

public class TransactionalJdbcTest {

    public static void main(String[] args){

        System.out.println("------------Transaction start -------------");
        CommandOperation command = new CommandOperation();
        int id = command.selectOperation("rollback10");

        System.out.println("------------Savepoint operation-------------");

        if ( null != command.getSavepoint() ) {
            System.out.println( command.getSavepoint() );
        }

        for ( int i=10; i < 100; i +=10 )  {
            command.insertOperation("rollback"+i,
                    String.format("rollback%d@test.com", i) , "Lithuania");
        }

        id = command.selectOperation("rollback20");

        try {
            command.rollback();
            System.out.println("------------Transaction end -------------");

            command.commit();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        id = command.selectOperation("rollback90");
    }
}
