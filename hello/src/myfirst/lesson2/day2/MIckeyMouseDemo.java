package myfirst.lesson2.day2;

public class MIckeyMouseDemo {

    public MIckeyMouseDemo() {
    }

    public static void main(String[] args) {

        // Default mouse: noname
        Mouse m1 = new Mouse();

        m1.setName("Jerry");
        System.out.println("m1 first was named:" + m1.getName());
        System.out.printf("m1 length is %d\n", m1.getName().length() );

        Mouse m2 = new Mouse("Nibbles");
        System.out.println("m2 first was named:" + m2.getName());

        // 1) Nullify: eligible for GC instantly
        m2 = null;

        // 2) Re-assigning the reference variable
        m2 = m1;

        Mouse m3 = new Mouse();
        m3.setName("Mickey");

        m1 = m3;

        // Call GC now :: DO NOT CALL IT AT HOME !
        System.gc();

        System.out.println(m1.getName());
        System.out.println(m2.getName());
        System.out.println(m3.getName());

        System.out.printf( " Mouse %s and %s : %s\n", m1.getName(), m2.getName(),
        m1.getName().equals( m2.getName() ) );

        System.out.printf( " Mouse %s and %s : %s\n", m1.getName(), m3.getName(),
        m1.getName().equals( m3.getName() ) );

    }
}
