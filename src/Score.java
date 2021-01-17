public class Score {
    private int readingScore;
    private int mathScore;
    private boolean knowsAlphabet;

    public Score() { }

    public Score(int readingScore, int mathScore, boolean knowsAlphabet) {
        this.readingScore = readingScore;
        this.mathScore = mathScore;
        this.knowsAlphabet = knowsAlphabet;
    }

    public int getReadingScore() {
        return readingScore;
    }

    public void setReadingScore(int readingScore) {
        this.readingScore = readingScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        if (mathScore < 0) {
            mathScore = 0;
        }
        this.mathScore = mathScore;
    }

    public boolean isKnowsAlphabet() {
        return knowsAlphabet;
    }

    public void setKnowsAlphabet(boolean knowsAlphabet) {
        this.knowsAlphabet = knowsAlphabet;
    }
}
