import java.util.stream.IntStream;

public class StreamExample5 {
    public static void main(String[] args) {
        int[] arr = {-4, 5, 0, 15, 9, 12, 14, 4, 5, 0, 3, 2, 8, 7, 0, 10, 24, 15, 13, 6, 7, 8};
multipleElements(arr);
    }

    static void multipleElements(int[]arr){
        IntStream.of(arr).map(x-> x*3).forEach(System.out::println);
    }
}
