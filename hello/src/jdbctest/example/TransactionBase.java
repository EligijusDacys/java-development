package jdbctest.example;

import java.sql.*;

public class TransactionBase extends OperationsBase {

    protected Savepoint savepoint;
    protected Connection connection;

    public Connection getConnection() {
        return this.connection;
    }

    public Savepoint getSavepoint() {
        return this.savepoint;
    }

    public void setSavepoint( final Savepoint savepoint ) {
        this.savepoint = savepoint;
    }

    public TransactionBase() {

        System.out.println( super.props );

        String drivers = props.getProperty("jdbc.drivers");
        if (drivers != null) System.setProperty("jdbc.drivers", drivers);

        String url = props.getProperty("jdbc.url");
        String user = props.getProperty("jdbc.username");
        String pass = props.getProperty("jdbc.password");

        try {
            this.connection = DriverManager.getConnection(url, user, pass);
            this.stmt = connection.createStatement();

            // Switch off transactional, handle via savepoints instead
            connection.setAutoCommit(false);
            this.setSavepoint( connection.setSavepoint() );

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void rollback() throws SQLException {

        try {

             System.out.println( "Rollback to " + this.savepoint + " started" );
             connection.rollback( this.savepoint );
             System.out.println( "Rollback to " + this.savepoint + " finished" );

        } catch (SQLException sqlException) {

            System.err.println( "Rollback to " + this.savepoint + " failed" );
            throw sqlException;
        }
    }

    public void commit() throws SQLException {

        try {

            System.out.println( "Commit to " + this.savepoint + " started" );
            connection.commit();
            System.out.println( "Commit to " + this.savepoint + " finished" );

        } catch (SQLException sqlException) {

            System.err.println( "Commit to " + this.savepoint + " failed" );
            throw sqlException;
        }
    }
}
