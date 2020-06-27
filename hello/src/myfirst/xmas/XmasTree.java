package myfirst.xmas;

/**
 * Print a proportional and decorated XMAS tree.
 * <p>
 * Demo of for do/while and while loops
 * Demo of ternary conditional operator
 */

public class XmasTree {

    public static void main(String[] arguments) {

        int width = 16;
        //
        Integer HEIGHT = 16; // Integer.valueOf( arguments[0] );

        System.out.println("Printing a XMAS TREE of height: " + HEIGHT + "\n");


        //treeshape(3 );
        //treeshape(4 );

        /*
        treeshape(HEIGHT - 8);
        treeshape(HEIGHT - 6);
        treeshape(HEIGHT - 4);

         */

        System.out.println( "\n\n" );
        xmastree(HEIGHT);

        int trunk = 0;

        do {

            for (int pole = 0; pole < width + 2; pole++) {

                if (pole > (HEIGHT - 2) && (HEIGHT + 2) > pole) {

                    for (int stump = 1, breadth = 0; breadth < (HEIGHT / 8) && stump < (width / 4); breadth++, ++stump) {
                        System.out.print("|");
                    }
                } else
                    System.out.print(" ");
            }
            System.out.print("\n");

        } while (++trunk < HEIGHT / 4);


    }

    static void xmastree ( final int years ) {

        int width = 0;

        for (int height = 0; height < years; height++) {

            int space = 0;
            while (space < years - height) {
                System.out.print(" ");
                space++;
            }

            for (width = 0; width < (2 * height + 1); width++) {

                // What is this?
                System.out.print( width + 1 % (height + 1) == 4 ? "o" : (width % 10 == 0 ? "*" : "."));
            }

            // Why this?
            System.out.println();
        }
    }


    static void treeshape(final int years ) {

        int width = 0;

        for (int height = 0; height < years; height++) {

            int space = 0;
            while (space < years - height) {
                System.out.print(" ");
                space++;
            }

            for (width = 0; width < (2 * height + 1); width++) {
                    System.out.print("*");
            }

            // Why this?
            System.out.println();
        }
    }
}


/**
 * **
 * ****
 * ******
 * ********
 * **********
 * ************
 * **************
 * ****************
 * ******************
 * |||
 * |||
 */