package linked;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import javax.annotation.Resource;
import javax.net.ssl.SNIHostName;

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
     * 虚拟头部节点
     */
    private Node dummyHead;

    /**
     * 链表长度
     */
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    /**
     * 返回链表长度
     *
     * @return
     */
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在链表头部添加元素
     *
     * @param e
     */
    public void addFirst(E e) {
        insert(0, e);
    }

    /**
     * 往链表的指定index位置添加元素
     *
     * @param index
     * @param e
     */
    public void insert(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Insert failed. Required index >0 and index < size");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = dummyHead.next;
        }
        //Node node = new Node(e);
        //node.next = prev.next;
        //prev.next = node;
        prev.next = new Node(e, prev.next);
        size++;
    }


    /**
     * 在链表的尾部添加元素
     *
     * @param e
     */
    public void append(E e) {
        insert(size, e);
    }

    /**
     * 根据 index 获取链表的元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Illegal index.");
        }
        // 第一个元素
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    /**
     * 获取第一个元素
     *
     * @return
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 获取最后一个元素
     *
     * @return
     */
    public E getLast() {
        return get(size - 1);
    }

    /**
     * 更新指定index的元素
     *
     * @param index
     * @param e
     */
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Illegal index.");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    /**
     * 是否包含该元素
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 删除指定位置的元素
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Required index >= 0 and index < size");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node delNode = prev.next;
        prev.next = delNode.next;
        size--;
        delNode.next = null;
        return delNode.e;
    }

    /**
     * 删除头部元素
     *
     * @return
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * 移除尾部元素
     *
     * @return
     */
    public E removeLast() {
        return remove(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null) {
            sb.append(cur)
                    .append(" -> ");
            cur = cur.next;
        }
        sb.append("NULL");
        return sb.toString();
    }
}
