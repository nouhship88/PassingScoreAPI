package test.java.ca.vanier;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ScoresTest{
    //when the case is grater than 6
    @Test
    public void testResultTrue1(){
    String args = "7";
    boolean answer = Scores.result(args);
    assertNotNull(answer);
    assertTrue("Checking if scores grater than 6", answer == true);
}

//when the case is less than 6
@Test
public void testResultTrue2(){
String args = "5";
boolean answer = Scores.result(args);
assertNotNull(answer);
assertTrue("Checking if scores less than 6", answer == false);
}

//when the case is grater than 6
@Test
    public void testResultFalse1(){
    String args = "8";
    boolean answer = Scores.result(args);
    assertNotNull(answer);
    assertFalse("Checking if scores grater than 6", answer == false);
    }

    //when the case is less than 6
@Test
public void testResultFalse2(){
String args = "8";
boolean answer = Scores.result(args);
assertNotNull(answer);
assertFalse("Checking if scores less than 6", answer == false);
}
}