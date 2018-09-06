import java.util.*;

public class Time {
    public static void main(String[] args) {
        Scanner ollie; //declaration of scanner 
        ollie = new Scanner(System.in); // initiate scanner as object
        
        System.out.print("Enter first time: "); // asks for first time
        String first = ollie.nextLine(); // assigns variable first to user input
        String[] parts = first.split(":"); // splits first time into parts through ":"
        String hour1 = parts[0]; // assigns hour1 to the hours of t1
        String minute1 = parts[1]; // assigns minute1 to the minutes of t1
        int h1 = Integer.parseInt( hour1 ); //parse string hour1 into integer h1
        int m1 = Integer.parseInt( minute1 ); // parse string minute 1 into integer m1
        int t1 = (h1 * 60 + m1); // converts t1 into minutes

        System.out.print("Enter second time: "); // asks the user to input the second time
        String second = ollie.nextLine(); // ollie scans and assigns variable to second
        String[] parts2 = second.split(":"); //slips second time into parts through ":"
        String hour2 = parts2[0]; // assigns hour2 to the hours of second time
        String minute2 = parts2[1]; // assigns minute2 to the minutes of the second time
        int h2 = Integer.parseInt( hour2 ); // parse string hour2 into integer h2
        int m2 = Integer.parseInt( minute2 ); // parse string minute2 into integer m2
        int t2 = (h2 * 60 + m2); // converts into minutes
        
        ollie.close(); // close scanner

        int d = ((t2 - t1 + 1440) % 1440); //allows for t1 and t2 to be fluid 
        System.out.println(( d / 60 ) + " hours and " + (d % 60) + " minutes"); // find out the hours by division and find extra minutes by taking the remainder


        

        
        
       

        

        

        
    }
}