
package netbeans.windowmaster;
import java.util.Scanner;

/**
 *
 * @author halfrikan
 */
public class WindowMaster {

    public static void main(String[] args) {
        //a sample program to let a customer enter in the size of a window
        //and get a cost output for the job
        
        //declare variables for height and width
        float height;
        float width;
        
        //declare String variables to hold the user's height
        //and width input
        String stringHeight;
        String stringWidth;
        
        //declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        // declare and initialize scanner object to get inputs
        Scanner myScanner = new Scanner(System.in);
        
        //get input from user for the height and width
        System.out.println("Please enter the height of the window: ");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter the width of the window: ");
        stringWidth = myScanner.nextLine();
        //these are string values and need to be converted to float values to 
        //work with the given data type
        
        //convert String values to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        //currently no error handling to make sure the right kind of values 
        //were entered, that will be for a later practice
        
        
        
    }
}
