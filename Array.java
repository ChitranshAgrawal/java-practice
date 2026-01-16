public class Array {
    public static void main ( String[] args ) {
        System.out.println("This is Array class");

        //int nums[][] = new int[3][]; // jagged array
        int nums[][] = new int[3][4];

        // enhanced for loop
        for ( int i[] : nums ) {
            for ( int j : i ) {
                j = (int) (Math.random() * 10);
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


