package countNumbers;

import java.util.*;

public class Counter {
    public static void main(String[] args) {
        Counter counter = new Counter();
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));
        counter.print(counter.count(list));





    }


    public <T>Map<T,Integer> count(List<T> list){
        Map<T, Integer> listUnique = new HashMap<T, Integer>();
        for (T number:list){
            if (!listUnique.containsKey(number)){
            listUnique.put(number,1);}
            else {
                int reiteration= listUnique.get(number);
                listUnique.put(number,reiteration);
                listUnique.replace(number,++reiteration);

            }

        }

return listUnique;
    }

    public void print(Map listUnique){
        System.out.print(listUnique);
    }
}
