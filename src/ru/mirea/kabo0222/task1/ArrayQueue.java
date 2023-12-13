package ru.mirea.kabo0222.task1;

public class ArrayQueue {
    private Object[] array;
    private int size;
    private int head;
    private int tail;

    public ArrayQueue(int capacity) {
        array = new Object[capacity];
    }

    public void enqueue(Object element) {
        if (size == array.length) {
            throw new IllegalStateException("Queue is full");
        }
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    public Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return array[head];
    }

    public Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        array = new Object[array.length];
        size = head = tail = 0;
    }
}