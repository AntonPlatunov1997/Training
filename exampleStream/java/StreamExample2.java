import java.util.stream.IntStream;

public class StreamExample2 {

    public static void main(String[] args) {
        int[] arr = {-4,5,10,15,9,12,14,4,5,6,3,2,8,7};
       int min= IntStream.of(arr).min().getAsInt();
getMin(arr);
    }

  static void getMin(int[] arr){
        IntStream.range(0,arr.length)
                .filter(i-> arr[i] == IntStream.of(arr).min().getAsInt() )
                .forEach(i-> System.out.println("Index: " + i+" Number: " + arr[i]));
  }
}
