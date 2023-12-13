package ru.mirea.kabo0222.task1;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue("Element 1");
        queue.enqueue("Element 2");
        queue.enqueue("Element 3");

        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Размер очереди: " + queue.size());

        queue.dequeue();
        System.out.println("Первый элемент после одного удаления из очереди: " + queue.element());
        System.out.println("Размер очереди после одного удаления из очереди: " + queue.size());

        queue.clear();
        System.out.println("Размер очереди после очистки: " + queue.size());
        System.out.println("Очередь пуста: " + queue.isEmpty());
    }
}

