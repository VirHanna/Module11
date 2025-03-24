import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] numbersArray = {"1, 2, 0", "4, 5"};

        String result = Arrays.stream(numbersArray)
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
