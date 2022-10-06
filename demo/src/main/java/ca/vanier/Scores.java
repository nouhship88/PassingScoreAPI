package ca.vanier;

public class Scores {
  public static boolean result(String args){
      double score = Double.parseDouble(args);
      return (score > 6);
  }
}