public class Array {
    public static void main ( String[] args ) {
        System.out.println("This is Array class");

        // //int nums[][] = new int[3][]; // jagged array
        // int nums[][] = new int[3][4];

        // // enhanced for loop
        // for ( int i[] : nums ) {
        //     for ( int j : i ) {
        //         j = (int) (Math.random() * 10);
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // jagged array concept

        int nums[][] = new int[3][];

        nums[0] = new int[4];
        nums[1] = new int[2];
        nums[2] = new int[3];

        for ( int i = 0 ; i < nums.length ; i++ ) {
            for ( int j = 0 ; j < nums[i].length  ; j++) {
                nums[i][j] = (int) (Math.random()*10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}

