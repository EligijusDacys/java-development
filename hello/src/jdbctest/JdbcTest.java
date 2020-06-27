package jdbctest;

import jdbctest.example.CommandOperation;
import jdbctest.example.PreparedstatementOperation;
import jdbctest.example.QueryOperation;
import jdbctest.example.TransactionOperation;

public class JdbcTest {

    public static void main(String[] args){

        System.out.println("------------Query operation-------------");
        new QueryOperation().queryOperation();

        System.out.println("------------Preparedstatement-----------");
        PreparedstatementOperation.preparedstatementOperation();

        System.out.println("------------Transaction-----------------");
        TransactionOperation.transactionOperation();
    }
}
