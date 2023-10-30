import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create a new ArrayList of mixed integer numbers (even and odd)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(6);
        numbers.add(11);

        // PART 1: With the use of Stream, find the square root of each number and print
        // Sort the ArrayList numbers
        numbers.sort(Integer::compareTo);

        // Find the square root of each number and print the even numbers only using
        // Stream
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(Math::sqrt)
                .forEach(squareRoot -> System.out
                        .println("Square root of is: " + squareRoot));

        // PART 2: Without the use of Stream, find the square root of each number and
        // Sort the ArrayList numbers
        Collections.sort(numbers);

        // Find the square root of each number and print the even numbers only
        for (Integer number : numbers) {
            double squareRoot = Math.sqrt(number);
            if (number % 2 == 0) {
                System.out.println("Square root of " + number + " is: " + squareRoot);
            }
        }
    }
}