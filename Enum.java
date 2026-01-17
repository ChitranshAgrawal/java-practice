enum Status {
    Success, Failure, Pending, Unknown
}

public class Enum {
    public static void main ( String args[] ) {
        // Status s = Status.Success;
        // System.out.println(s);

        Status[] allStatus = Status.values();

        for ( Status s : allStatus ) {
            System.out.println(s + " at index: " + s.ordinal());
        }
    }
}



