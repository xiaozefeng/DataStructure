package queue;

/**
 * 队列
 *
 * @author xiaozefeng
 * @date 2018/5/9 下午9:57
 */
public interface Queue<E> {
    /**
     * 获取队列长度
     * @return
     */
    int size();

    /**
     * 查看队列是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 往队列的尾部添加元素
     */
    void  enqueue(E e);

    /**
     * 往队列的首部获取元素并移除这个元素
     * @return
     */
    E dequeue();

    /**
     * 获取队列首部的元素
     * @return
     */
    E getFront();
}
