package ca.vanier;

public class Scores
{
    public boolean result(String score)
    {
      return Double.parseDouble(score) > 6;
    }
}
