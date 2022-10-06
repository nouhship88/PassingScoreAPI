package ca.vanier;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PassingScoreAPITest {
    
    @Test
    public void ScoreTest1() {

        // Arrange
        int score = 6;

        // Act
        boolean pass = PassingScoreAPI.isPass( score );

        // Assert
        assertEquals( pass, true );
    }

    @Test
    public void ScoreTest2() {

        // Arrange
        int score = 5;

        // Act
        boolean pass = PassingScoreAPI.isPass( score );

        // Assert
        assertEquals( pass, false );
    }

    @Test
    public void ScoreTest3() {

        // Arrange
        int score = 0;

        // Act
        boolean pass = PassingScoreAPI.isPass( score );

        // Assert
        assertEquals( pass, false );
    }

    @Test
    public void ScoreTest4() {

        // Arrange
        int score = -1;

        // Act
        boolean pass = PassingScoreAPI.isPass( score );

        // Assert
        assertEquals( pass, false );
    }

    @Test
    public void ScoreTest5() {

        // Arrange
        int score = 10;

        // Act
        boolean pass = PassingScoreAPI.isPass( score );

        // Assert
        assertEquals( pass, true );
    }

    @Test
    public void ScoreTest6() {

        // Arrange
        int score = 28397648;

        // Act
        boolean pass = PassingScoreAPI.isPass( score );

        // Assert
        assertEquals( pass, true );
    }
}
