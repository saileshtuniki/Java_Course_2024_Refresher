import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,6,3,2,7,8);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);
        
        //customize the above code

         
        int result = nums.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .reduce(0, (current,element) -> current + element);
                        //Here, 0 is the initial value (c , e) are two variable assume carry & element, c+e is the operation. 

        // System.out.println(nums);
        System.out.println(result);

    }
}
