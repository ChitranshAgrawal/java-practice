@FunctionalInterface
interface A {
    public void show();
}

public class Lambda {
    public static void main ( String args[] ) {

        // Anonymous inner class

        // A a = new A() {
        //     public void show() {
        //         System.out.println("in Show");
        //     }
        // };
        // a.show();

        // Lambda Expression

        A a = () -> System.out.println("in Show");
        a.show();
    }
}

