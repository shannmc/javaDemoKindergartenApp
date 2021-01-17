import java.util.Arrays;
import java.util.List;

public class KindergartenGraduationApp {
    public static void main(String[] args) {
//        Score score = new Score(50, 50, false);
//
//        CharlestonCalculator charlestonCalculator = new CharlestonCalculator();
//        System.out.println(charlestonCalculator.calculatePass(score));
//        List<String> nameList = Arrays.asList("bob", "bailey", "bop");
//        nameList
//                .stream()
//                .filter(n -> n.startsWith("b"))
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);

        List<String> nameList = Arrays.asList("bobby", "bailey", "aaron", "cara");
        nameList
                .stream()
                .filter(n -> n.startsWith("b"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
