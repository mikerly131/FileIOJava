package Step4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {

            System.out.print("Writing to file ... ");
            // Create the file to write to
            PrintWriter fileOut = null;
            try {
                fileOut = new PrintWriter("output2.txt");
            } catch (IOException e) {
                System.out.println("File not found");;
            }

            try {
                Scanner fileIn = new Scanner(new File("src/main/java/Step4/input.txt"));
                int sum = 0;
                while (fileIn.hasNext())
                {
                    // Reads the entire line as a string
                    String lineIn = fileIn.nextLine();
                    // Split the line into a String array
                    String[] input = lineIn.split(",");
                    
                    for (int i = 0; i < input.length; i ++) {
                        sum += Integer.parseInt(input[i]);
                        fileOut.println(sum);
                    }
                }
                fileOut.close();
            }
            catch (IOException e) {
                System.out.println("File not found");
            }

            // Print out a running total of all the
            // values in the input file.
        }
}