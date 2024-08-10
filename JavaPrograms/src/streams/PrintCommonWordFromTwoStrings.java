package streams;

import java.util.Set;
import java.util.stream.Collectors;

public class PrintCommonWordFromTwoStrings {

    public static void main(String[] args) {
        String s1 = "Rajesh";
        String s2 = "Naresh";

        // Convert strings to sets of characters
        Set<Character> set1 = s1.chars()
                                .mapToObj(c -> (char) c)
                                .collect(Collectors.toSet());
        Set<Character> set2 = s2.chars()
                                .mapToObj(c -> (char) c)
                                .collect(Collectors.toSet());

        // Find common characters using streams
        Set<Character> commonChars = set1.stream()
                                         .filter(set2::contains)
                                         .collect(Collectors.toSet());

        // Print common characters
        System.out.println(commonChars);
        System.out.println("Common letters: " + commonChars.stream()
                                                            .map(String::valueOf)
                                                            .collect(Collectors.joining(", ")));
    }
}
