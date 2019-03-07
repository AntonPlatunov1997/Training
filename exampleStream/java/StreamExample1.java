import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,0,10,24,15,13,6,7,8};
        getAvarage(arr);
    }
 public static void getAvarage(int[] arr){
    IntStream.of(arr).average().ifPresent(System.out::println);
}

}
