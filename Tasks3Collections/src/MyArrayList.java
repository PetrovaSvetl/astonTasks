import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MyArrayList<E> {
    private E [] elements;
    private int capacity;
    private int size;

    public MyArrayList() {

        capacity = 10;
        size = 0;
        elements = (E[]) new Object[capacity];
    }
    public MyArrayList (Collection<? extends E> collection) {
        capacity =  collection.size() ;
        size = 0;
        elements = (E[]) new Object[collection.size()];
        for (E col : collection) {
            this.add(col);
        }

    }
    public void add (E element) {
        if (size == capacity) {
            growArrayList();
        }
        elements[size] = element;
        size++;
    }
    public E get(int index) {
                    if (index > size)
                    {throw new IndexOutOfBoundsException();}

        return elements[index];

    }
    public void remove(int index) {
        elements[index] = null;
    }
    public void addAll (Collection<? extends E> collection) {
        for (E collect : collection) {
            add(collect);
        }
    }
    public void printArrayList() {
        for (E element : elements)
            System.out.println(element + " ");
    }
    private void growArrayList() {
        capacity = (int) (capacity *  1.5);
        E [] newElements = (E[]) new Object[capacity];

        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
}
