package ca.vanier;

public class App 
{
    public static void main( String[] args )
    {

        // Prompt the user to input score
        int score = inputScore( args );

        // Check if the score is a passing score
        boolean isPass = PassingScoreAPI.isPass( score );

        // Print result to the console.
        if ( isPass )
            System.out.println( "PASS" );
        else
            System.out.println( "FAIL" );
    }


    // Parses the given args array and returns an integer score or quits with a message.
    private static int inputScore( String[] args ) {

        String errMsg = null; 

        // Make sure there is only one argument
        if ( args.length != 1 )
            errMsg = "PassingScoreAPI takes in only one parameter, which is a positive integer that represents a test score. " + args.length + " arguments provided.";

        // Parse the score
        else {

            try {
                int score = Integer.parseInt( args[0] );

                return score;
            }
            catch ( NumberFormatException e ) {
                errMsg = "Invalid score. Please input a positive integer";
            }
        }

        // If there is an error, print it to the console and quit
        System.out.println( errMsg );
        System.exit(0);

        return -1;
    }
}
