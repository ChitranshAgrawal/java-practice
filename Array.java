class Student {
    int rollNo;
    String name;
    double marks;
}

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

        // // jagged array concept

        // int nums[][] = new int[3][];

        // nums[0] = new int[4];
        // nums[1] = new int[2];
        // nums[2] = new int[3];

        // for ( int i = 0 ; i < nums.length ; i++ ) {
        //     for ( int j = 0 ; j < nums[i].length  ; j++) {
        //         nums[i][j] = (int) (Math.random()*10);
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        // // array of objects

        Student s1 = new Student();
        s1.rollNo = 001;
        s1.name = "Gullu";
        s1.marks = 99.2;

        Student s2 = new Student();
        s2.rollNo = 002;
        s2.name = "Chiku";
        s2.marks = 98.5;

        Student s3 = new Student();
        s3.rollNo = 003;
        s3.name = "Chiya";
        s3.marks = 92.23;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // // System.out.println(s1);

        // for ( int i = 0 ; i < students.length ; i++ ) {
        //     System.out.println(students[i].rollNo + "  " + students[i].name + "  " + students[i].marks);
        // }

        // enhanced for loop (for-each loop) for array of objects

        for ( Student s : students ) {
            System.out.println(s.rollNo + "  " + s.name + "  " + s.marks);
        }


        // // enhanced for loop (for-each loop)

        // int nums[] = new int[50];

        // for ( int i : nums ) {
        //     i = (int)(Math.random()*100);
        //     System.out.print(i + "  ");
        // }

    }
}





