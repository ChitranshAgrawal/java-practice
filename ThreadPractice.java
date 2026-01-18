class One extends Thread {
    public void run() {
        for ( int i = 0 ; i < 100 ; i++ ) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Two extends Thread {
    public void run() {
        for ( int i = 0 ; i< 100 ; i++ ) {
            System.out.println("World");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPractice {
    public static void main ( String args[] ) {
        One one = new One();
        Two two = new Two();

        two.setPriority(Thread.MAX_PRIORITY);

        one.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        two.start();
    }
}







