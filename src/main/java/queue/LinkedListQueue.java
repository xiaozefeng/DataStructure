package queue;

/**
 * 使用链表实现队列结构
 *
 * @author xiaozefeng
 * @date 2018/5/10 下午9:36
 */
public class LinkedListQueue<E> implements Queue<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    /**
     * 头部节点
     */
    private Node head;

    /**
     * 尾部节点
     */
    private Node tail;

    private int size;

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
        //操作尾部
        if (tail == null) {
            tail = new Node(e);
            // 当tail节点为空时，head也为空
            head = tail;
        } else {
            tail.next = new Node(e);
            // 将tail 移动到末尾
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot deQueue from an empty queue.");
        }
        Node retNode = head;
        // 将head 后移一位
        head = head.next;
        // 将retNode 与链表断开
        retNode.next = null;
        if (head == null) {
            tail = null;
        }
        size--;
        return retNode.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty.");
        }
        return head.e;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: front ");
        Node cur = head;

        while (cur != null) {
            sb.append(cur + " -> ");
            cur = cur.next;
        }

        sb.append("NULL tail");
        return sb.toString();

    }
}
