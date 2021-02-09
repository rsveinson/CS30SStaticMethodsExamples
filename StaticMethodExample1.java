import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Static Method example
 * 
 *  Description:    Some simple examples of static methods
 *                  in practice
 * 
 *************************************************************/

public class StaticMethodExample1 {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
        String name = "Sveinson";
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        System.out.println(printBannerToScreen(nl, name));
        //printBannerToScreen(nl, name);
        
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
    // **** static methods ****
    
    /* ****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    /* ****************************************
    * Description: print a banner to the screen
    * 
    * Interface:
    * 
    * @param        none
    * 
    * @return       String banner 
    * ****************************************/ 
    public static String printBannerToScreen(String newLineChar, String name){
        String banner = "";
        
        banner = "*****************************" + newLineChar;
        banner += "Name:        " +  name + newLineChar;
        banner += "Class:       CS30S" + newLineChar;
        banner += "Assignment:  Static Method example" + newLineChar;
        banner += "*****************************" + newLineChar + newLineChar;
        
        return banner;        
    }// end printBannerToScreen    
    
    /* ****************************************
    * Description: print a banner to the screen
    * 
    * Interface:
    * 
    * @param        none
    * 
    * @return       none
    * ****************************************/ 
    // public static void printBannerToScreen(String newLineChar){
        // String banner = "";
        
        // banner = "*****************************" + newLineChar;
        // banner += "Name:        Sveinson" + newLineChar;
        // banner += "Class:       CS30S" + newLineChar;
        // banner += "Assignment:  Static Method example" + newLineChar;
        // banner += "*****************************" + newLineChar + newLineChar;
        
        // System.out.println(banner);        
    // }// end printBannerToScreen
} // end FormatTemplate
