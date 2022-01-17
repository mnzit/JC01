package com.ggic.jb01;

public class CustomArrayList<T> implements CustomList<T> {

    private Object[] elements = new Object[0];

    @Override
    public void add(T element) {
        int length = elements.length;
        int newSize = length + 1;
        Object[] temp = new Object[newSize];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
        elements[elements.length - 1] = element;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < elements.length; i++) {
            result += elements[i];
            if (i != elements.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
