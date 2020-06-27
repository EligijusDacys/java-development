package myfirst.lesson2.day2;

import java.util.Random;

public class Mouse {

    // class access only: encapsulate and default init
    // private String name = new String( "Noname" );
    // private String name = "";
    // private String name = "mouse" + new Random().nextInt(100);

    private String name;   // a.k.a   this.name

    // Default constructor: initialize Mouse as object
    public Mouse( ) {
        System.out.println( "Create a noname mouse: " + this.name );
    }

    // Pseudo destructor : only at GC
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println( "Destruct a mouse: " + this.name );
    }

    // Parametrized constructor
    public Mouse( final String name ) {

        // Assign to local class var
        this.name = name;

        // Put it to String Pool
        String asLiteral1 = "Calling A Mouse: ";

        // this.name = this.name;
        System.out.println( asLiteral1.toLowerCase() + this.getName() );

        // Find it in pool, if duplicate, point only
        final String asLiteral2 = "Calling A Mouse: ";
        asLiteral2.length();

        String s1 = "1";
        String s2 = s1 + "2";

        s2 += "3";

        // Two literals in the pool.
        if ( (s2+"3").equals(s2+"2") ) {

        }

    }

    // Getter
    public String getName() {
        return this.name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}
