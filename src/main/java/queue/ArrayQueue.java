package queue;

import array.Array;

/**
 * @author xiaozefeng
 * @date 2018/5/9 下午10:00
 */
public class ArrayQueue<E> implements Queue<E>{
    private Array<E> array;

    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayQueue() {
        array = new Array<>();
    }

    @Override
    public int size() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int capacity() {
        return array.capacity();
    }

    @Override
    public void enqueue(E e) {
        array.append(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "array=" + array +
                '}';
    }
}
