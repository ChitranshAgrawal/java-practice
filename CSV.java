// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

// public class CSV {
//     public static void main(String[] args) {
//         String file = "foods.csv"; // change to CSV file name
//         String line = "";

//         try (BufferedReader br = new BufferedReader(new FileReader(file))) {

//             while ((line = br.readLine()) != null) {
//                 // Split by comma
//                 String[] values = line.split(",");
                
//                 // Print all values in the row
//                 for (String value : values) {
//                     System.out.print(value + "  ");
//                 }
//                 System.out.println(); // new line
//             }

//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }




import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSV {
    public static void main(String[] args) {
        try {
            // Open file chooser
            JFileChooser chooser = new JFileChooser();
            int result = chooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                String filePath = chooser.getSelectedFile().getAbsolutePath();
                System.out.println("File selected: " + filePath);

                BufferedReader br = new BufferedReader(new FileReader(filePath));
                String line;

                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    for (String v : values) {
                        System.out.print(v + "  ");
                    }
                    System.out.println();
                }

                br.close();
            } else {
                System.out.println("No file selected.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

