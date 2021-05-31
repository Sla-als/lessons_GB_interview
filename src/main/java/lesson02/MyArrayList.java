package lesson02;

public class MyArrayList<T extends Comparable> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity <=0" + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Comparable[capacity];
    }

    public MyArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Comparable[capacity];
    }

    public int getSize(){
        return size;
    }

    public final boolean checkIndex(int index){
        int startIndex = 0;
        int endIndex = getSize()-1;
        if(index>= startIndex && index<=endIndex){
            return true;
        }
        return false;
    }

    public void setList(T[] list) {
        this.list = list;
    }

    public final void checkSize() {
        if (list[list.length - 1] != null) {
            T[] newList = list;
            this.setList((T[]) new Comparable[(int) (capacity * 1.5)]);
            this.capacity = list.length;
            System.arraycopy(newList, 0, this.list, 0, newList.length);
        }
    }

    public void add(T item) {
        checkSize();
        list[size] = item;
        size++;
    }

    public void add(int index, T item) {

        checkSize();
        if (checkIndex(index)) {
            for (int i = size; i > index; i--) {
                list[i] = list[i - 1];
            }
            list[index] = item;
            size++;
        }
        throw new IndexOutOfBoundsException("Element from index " + index + " doe's not exist");
    }

    public final T remove(int index) {
        if (checkIndex(index)) {
            T temp = list[index];
            for (int i = index; i < size; i++) {
                list[i] = list[i + 1];
            }
            size--;
            list[size] = null;
            return temp;
        }
        throw new IndexOutOfBoundsException("Element from index " + index + " doe's not exist");
    }

    public boolean remove(T item) {
        int i = indexOf(item);
        if (i == -1) {
            return false;
        }
        remove(i);
        return true;
    }

    public int indexOf(T item) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public T get(int index) {
        if (checkIndex(index)) {
            return list[index];
        }
        throw new IndexOutOfBoundsException("Element from index " + index + " doe's not exist");
    }

    public void set(int index, T item) {
        if (checkIndex(index)) {
            list[index] = item;
        }
        throw new IndexOutOfBoundsException("Element from index " + index + " doe's not exist");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < size; i++) {
            sb.append(list[i]).append(", ");
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }

        sb.append(" ]");
        return sb.toString();
    }


}
