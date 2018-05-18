package stack;

import linked.LinkedList;

/**
 * 使用链表实现的栈
 *
 * @author xiaozefeng
 * @date 2018/5/10 下午8:58
 */
public class LinkListStack<E> implements Stack<E>{

    private LinkedList<E> list;

    public LinkListStack() {
        this.list = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: top ")
                .append(list);
        return sb.toString();
    }
}
