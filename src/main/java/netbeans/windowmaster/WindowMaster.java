
package netbeans.windowmaster;
import java.util.Scanner;

/**
 *
 * @author halfrikan
 */
public class WindowMaster {

    public static void main(String[] args) {
        //a sample program to let a customer enter in the size of a window
        //and get a cost output for the glass and trim
        
        //declare variables for height and width
        float height;
        float width;
        
        
        
        //declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        // declare and initialize scanner object to get inputs
        Scanner myScanner = new Scanner(System.in);
        
        
        
        //use method just created to get height and weight
        height = readValue("Please enter value for height");
        width = readValue("Please enter value for width ");
        
        //currently no error handling to make sure the right kind of values 
        //were entered, that will be for a later practice
        
        //adding calculations
        areaOfWindow = areaCalc(height, width);
        perimeterOfWindow = permCalc(height, width) ;
        
        //now we add the cost for the glass and trim
        //calculate the total using hard-coded values
        //for material cost 3.50 per foot^2 for glass and 2.25 for trim
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        
        //display results to user
        System.out.println("Window height is: " + height);
        System.out.println("Window width is: " + width);
        System.out.println("Window area is: " + areaOfWindow);
        System.out.println("Window perimeter is: " + perimeterOfWindow);
        System.out.println("Total cost is: " + cost);
    }

    public static float readValue (String prompt){
        //declare and initialize  a Scanner variable
        Scanner myScanner = new Scanner(System.in);

        //print prompt to console
        System.out.println(prompt);

        //read value into string data type
        String input = myScanner.nextLine();

        //convert the string to a float
        float floatVal = Float.parseFloat(input);

        // return the float value
        return floatVal;
    }

    public static float areaCalc(float h, float w){
        float area = w * h;
        return area;

    }

    public static float permCalc( float h, float w){
        float perimeter = 2 * (h + w);
        return perimeter;
    }
}
