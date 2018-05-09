package stack;

import array.Array;

import java.util.Arrays;
import java.util.Calendar;

/**
 * 基于动态数组实现的栈
 *
 * @author xiaozefeng
 * @date 2018/5/9 下午5:57
 */
public class ArrayStack<E> implements Stack<E> {
    private Array<E> array;

    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }


    public ArrayStack() {
        array = new Array<>();
    }


    @Override
    public int getSize() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.append(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    /**
     * 查看容量
     *
     * @return
     */
    public int capacity() {
        return array.capacity();
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "array=" + array +
                '}';
    }
}
