package ca.vanier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class ScoreTest 
{
    Scores scores = new Scores();

    @Test
    public void shouldAnswerWithTrue()
    {
        String args = "7";
        boolean answer = scores.result(args);
        assertNotNull(answer);
        assertTrue("Checking if score is greater than 6", answer ==true);
        
    }

    @Test
    public void shouldAnswerWithFalse()
    {
        String args = "9";
        boolean answer = scores.result(args);
        assertNotNull(answer);
        assertFalse("Checking if score is less than 6", answer == false);
        
    }

}