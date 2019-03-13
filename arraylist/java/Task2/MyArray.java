package Task2;

import java.util.Arrays;

public class MyArray {
    private Object [] arr;
    private int position;

    public MyArray(){
        arr = new Object[2];
    }

    public MyArray(int size){
        arr= new Object[size];
    }


    public void add(Object o){
        if (!checkSize()){
            extendArray();
        }
        arr[position]=o;
        position++;

    }

    public int size(){
        return arr.length;
    }
    private boolean checkSize(){
        if (position+1>arr.length){
            return false;
        }else return true;
    }

    private void extendArray(){
          Object[] temproary = new Object[(arr.length * 3) / 2 + 1];
          System.arraycopy(arr,0,temproary,0,arr.length);
          arr =temproary;

    }

public Object get(int index){
        return arr[index];
}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyArray{");
        sb.append("arr=").append(Arrays.toString(arr));

        sb.append('}');
        return sb.toString();
    }
}
