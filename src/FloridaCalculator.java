public class FloridaCalculator implements KindergartenCalculator {

    @Override
    public boolean calculatePass(Score score) {
        return (score.getReadingScore() > 75 && score.getMathScore() > 65);
    }
}
