import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(2,5,7,8,4,6,9,1);

        //using Sorting method.

        Stream<Integer> sortedValue = nums.stream()
                        .filter(n -> n%2==0)
                        .sorted()
                        .map(n -> n*2);

        sortedValue.forEach(n-> System.out.println(n));
    }
}
