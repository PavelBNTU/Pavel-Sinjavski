package dz4;

import java.util.Arrays;

public class CustomArrayList<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public CustomArrayList() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = element;
    }

    public void addAll(T[] array) {
        if (size + array.length > elements.length) {
            increaseCapacity(size + array.length);
        }
        System.arraycopy(array, 0, elements, size, array.length);
        size += array.length;
    }

    public void addAtIndex(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (size == elements.length) {
            increaseCapacity();
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    public void clear() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    private void increaseCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    private void increaseCapacity(int minCapacity) {
        int newCapacity = Math.max(elements.length * 2, minCapacity);
        elements = Arrays.copyOf(elements, newCapacity);
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Integer[] array = {4, 5, 6};
        list.addAll(array);

        list.addAtIndex(2, 10);

        list.removeAtIndex(3);

        System.out.println(list);

        list.clear();

        System.out.println(list);
    }
}
