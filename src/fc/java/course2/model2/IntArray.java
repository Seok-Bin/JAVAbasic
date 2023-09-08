package fc.java.course2.model2;

import java.util.Arrays;

public class IntArray {
    private final int DEFAULT_CAPACITY = 5;
    private int[] elements;
    private int size = 0;

    // 생성동작
    public IntArray(){
        elements = new int[DEFAULT_CAPACITY]; // 5개 크기의 배열 생성
    }


    // 원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }


    // 얻는 동작
    public int get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("범위초과");
        }
        return elements[index];
    }


    // 저장하는 동작
    public void add(int element){
        if (size == elements.length){
            // 크기를 2배로 늘리는 작업
            ensureCapacity();
        }else {
            elements[size++] = element;
        }
    }

    private void ensureCapacity() {
        int newCapasity = elements.length*2;
        elements = Arrays.copyOf(elements, newCapasity);
    }
}
