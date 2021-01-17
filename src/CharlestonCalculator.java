public class CharlestonCalculator extends ScCalculator{

    public boolean isStudentGifted(Score score) {
        return score.getMathScore() > 97;
    }

    public boolean calculatePass(Score score) {
        System.out.println("CHARLESTON");
        return super.calculatePass(score) && score.isKnowsAlphabet();
    }

}
