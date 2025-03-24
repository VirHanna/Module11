import java.util.Iterator;
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        return Stream.generate(() -> {
                    if (firstIterator.hasNext() && secondIterator.hasNext()) {
                        T firstElement = firstIterator.next();
                        T secondElement = secondIterator.next();
                        return Stream.of(firstElement, secondElement);  // Повертаємо пару елементів
                    }
                    return null;  // Якщо один з потоків закінчився, повертаємо null
                })
                .takeWhile(element -> element != null)  // Виходимо, коли один з потоків закінчився
                .flatMap(s -> s); // Розгортаємо пару елементів
    }

    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> second = Stream.of(6, 7, 8, 9);

        zip(first, second)
                .forEach(System.out::println);
    }
}
