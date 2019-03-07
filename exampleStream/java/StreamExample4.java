import java.util.stream.IntStream;

public class StreamExample4 {
    public static void main(String[] args) {
        int[] arr = {-4, 5, 0, 15, 9, 12, 14, 4, 5, 0, 3, 2, 8, 7, 0, 10, 24, 15, 13, 6, 7, 8};
        countElementsInRange(arr);
    }

    static void countElementsInRange(int[]arr){
        int count = (int) IntStream.of(arr).filter(x-> x>0).count();
        System.out.println(count);
    }

}
