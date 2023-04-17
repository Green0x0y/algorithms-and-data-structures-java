package org.Tasks.Bot.Queues;

import java.util.ArrayDeque;

public class MyArrayDeque<T> {

    private ArrayDeque<T> deque;

    public MyArrayDeque() {
        deque = new ArrayDeque<>();
    }

    public void addFirst(T item) {
        deque.addFirst(item);
    }

    public void addLast(T item) {
        deque.addLast(item);
    }

    public T removeFirst() {
        return deque.removeFirst();
    }

    public T removeLast() {
        return deque.removeLast();
    }

    public T peekFirst() {
        return deque.peekFirst();
    }

    public T peekLast() {
        return deque.peekLast();
    }

    public int size() {
        return deque.size();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }
}