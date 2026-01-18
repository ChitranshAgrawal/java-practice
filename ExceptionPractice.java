class MyException extends Exception {
    public MyException ( String str ) {
        super(str);
    }
}

class B {
    public void checkException() throws ClassNotFoundException {
        Class.forName("Chiku");
    }
}

public class ExceptionPractice {
    public static void main( String[] args ) {

        int i = 20;
        int j = 0;

        try {
            j = 10/i;
            if (j==0)
                throw new MyException("Cannot divide by zero");
        }
        catch ( MyException e ) {
            System.out.println("Caught MyException " + e.getMessage());
        }

        System.out.println("Value of j: " + j);
        
        B b = new B();

        try {
            b.checkException();
        }
        catch ( ClassNotFoundException e ) {
            System.out.println("Class Not Found");
        }

    }
}




