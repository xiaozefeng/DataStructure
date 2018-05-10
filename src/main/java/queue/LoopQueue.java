package queue;

/**
 * 循环队列
 *
 * @author xiaozefeng
 * @date 2018/5/9 下午10:23
 */
public class LoopQueue<E> implements Queue<E> {
    private E[] data;
    private int front;
    private int tail;
    private int size;

    public LoopQueue(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Required capacity >=0");
        }
        // 因为是循环队列，我们有意识的浪费了一个空间，所以需要多要一个元素的空间
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    public int capacity() {
        return data.length - 1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public void enqueue(E e) {
        // 判断队列是否已满
        if ((tail + 1) % data.length == front) {
            resize(capacity() * 2);
        }
        data[tail] = e;
        // 由于是循环队列
        tail = (tail + 1) % data.length;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from empty queue");
        }
        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if (size == capacity() / 4 && capacity() / 2 != 0) {
            resize(capacity() / 2);
        }
        return ret;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        }
        return data[front];
    }


    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity + 1];
        // 把原来数组中的元素放入新的数组中，由于有front个偏移量，所以是 i +front ，又由于是循环数组，为了避免越界问题
        // 我们对 data.length 取余
        for (int i = 0; i < size; i++) {
            newData[i] = data[(i + front) % data.length];
        }
        data = newData;
        // 指向新数组的第一个元素
        front = 0;
        tail = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Queue: size=%d, capacity=%d\n", size, capacity()))
                .append("front:[");
        for (int i = front; i != tail; i = (i + 1) % data.length) {
            sb.append(data[i]);
            if ((i + 1) % data.length != tail) {
                sb.append(", ");
            }
        }
        sb.append("] tail");
        return sb.toString();
    }
}
