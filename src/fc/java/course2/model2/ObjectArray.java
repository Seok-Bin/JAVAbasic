package fc.java.course2.model2;

import java.util.Arrays;

public class ObjectArray {
    private final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size = 0;

    // 생성동작
    public ObjectArray(){
        this(5); // 5개 크기의 배열 생성
    }

    public ObjectArray(int capacity){
        elements = new Object[capacity]; //원하느 크기로 배열을 만드는 기능
    }


    // 원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }


    // 얻는 동작
    public Object get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index의 범위초과" );
        }
        return elements[index];
    }


    // 저장하는 동작
    public void add(Object element){
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
