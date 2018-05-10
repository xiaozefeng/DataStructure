package linked;

import com.sun.scenario.effect.impl.prism.PrImage;

/**
 * 链表
 *
 * @author xiaozefeng
 * @date 2018/5/10 上午11:32
 */
public class LinkedList<E> {



    /**
     * 定义节点 Node
     * 定义为内部类，用户不需要知道
     */
    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node(){
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }


    /**
     * 链表头部元素
     */
    private Node head;

    /**
     * 链表长度
     */
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    /**
     * 返回链表长度
     * @return
     */
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 在链表头部添加元素
     * @param e
     */
    public void addFirst(E e) {
        //Node node = new Node(e);
        //node.next = head;
        //head = node;

        head = new Node(e, head);
        size++;
    }

    /**
     * 往链表的指定index位置添加元素
     * @param index
     * @param e
     */
    public void insert(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Insert failed. Required index >0 and index < size");
        }

        if (index == 0) {
            addFirst(e);
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = head.next;
            }
            //Node node = new Node(e);
            //node.next = prev.next;
            //prev.next = node;
            prev.next = new Node(e, prev.next);
        }
        size++;

    }


    /**
     * 在链表的尾部添加元素
     * @param e
     */
    public void append(E e) {
        insert(size, e);
    }
}
