import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Alex", "John", "Mike");

        List<String> result = names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
