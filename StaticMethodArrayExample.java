import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     StaticMethodArrayExample
 * 
 *  Description:    some examples of the argument parameter interface
 *                  and of passing arrays into methods
 * 
 *************************************************************/

public class StaticMethodArrayExample {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        // declare some variables and an array for use with the exaample
        int n = 0;
        int m = 0;
        double x = 0.0;
        
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = 0;
        
        int fiveMore = 0;
        int threeTimes = 0;
        
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Passing Arrays" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****

    
    // ***** Main Processing *****
    
        System.out.println(list);
        
        // prompt = "enter an integer:";
        // n = getDataFromKb(prompt);
        
        // prompt = "enter another integer:";
        // m = getDataFromKb(prompt);
        
        // prompt = "enter another double:";
        // x = getDataFromKb(prompt, x);
        
        // argument parameter interface experiments
        // changeParam(n);
        // System.out.println("n in main is " + n);
        
        // changeList(list);
        // System.out.println("list 1 in main is " + list[0]);
        
        // process values in the array called list
        
        for(int i = 0; i < list.length; i++){
            //System.out.println(list[i]);
            fiveMore = addFive(list[i]);
            threeTimes = triple(list[i]);
            
            System.out.format("%5d %5d %5d %s", list[i], fiveMore, threeTimes, nl);
        }// end for int i
        
        length = list.length;
        printList(list, length);
        
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
    public static void printList(int[] l, int len){
        for(int i = 0; i < len; i++){
            System.out.println("List: " + l[i]);
            
        }// end for int i
    }// end print list
    
    public static int addFive(int n){
        return n + 5;
    }
    
    public static int triple(int n){
        return n * 3;
    }
    public static void changeList(int[] list){
        System.out.println(list);
        list[0] = 20;
        System.out.println("list 1 in method is " + list[0]);
    }// end change list
    
    public static void changeParam(int n){
       n = n + n;
       System.out.println("n inside method is " + n);
    }
    
    public static int getDataFromKb(String p){
        Scanner scanner = new Scanner(System.in);
        System.out.println(p);
        return scanner.nextInt();
    }// end get int data

    public static double getDataFromKb(String p, double d){
        Scanner scanner = new Scanner(System.in);
        System.out.println(p);
        d = scanner.nextDouble();
        return d;
    }// end get int data
    
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
    
} // end FormatTemplate
