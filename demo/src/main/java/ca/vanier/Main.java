package ca.vanier;

public class Main 
{
    public static void main( String[] args )
    {
      String value = args[0];
      Scores scores = new Scores();
      System.out.println(scores.result(value));
    }
}
