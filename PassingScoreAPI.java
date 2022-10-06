package ca.vanier;

public final class PassingScoreAPI {

    /**
     * This method checks to see if the given score is considered to be a pass.
     * @param score the score to check.
     * @return {@code true} if the score is a pass, {@code false} otherwise.
     */
    public static boolean isPass( int score ) {
        return score > 5;
    }
}