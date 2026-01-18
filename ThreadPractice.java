class One extends Thread {
    public void run() {
        for ( int i = 0 ; i < 100 ; i++ ) {
            System.out.println("Hello");
        }
    }
}

class Two extends Thread {
    public void run() {
        for ( int i = 0 ; i< 100 ; i++ ) {
            System.out.println("World");
        }
    }
}

public class ThreadPractice {
    public static void main ( String args[] ) {
        One one = new One();
        Two two = new Two();

        one.start();
        two.start();
    }
}




