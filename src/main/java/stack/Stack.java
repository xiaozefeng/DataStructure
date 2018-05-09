package stack;

/**
 * 栈结构
 *
 * @author xiaozefeng
 * @date 2018/5/9 下午5:55
 */
public interface Stack<E> {
    /**
     * 获取栈的长度
     *
     * @return
     */
    int getSize();

    /**
     * 查看栈是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 向栈中添加元素
     *
     * @param e
     */
    void push(E e);

    /**
     * 弹栈
     *
     * @return
     */
    E pop();

    /**
     * 查看栈顶元素
     *
     * @return
     */
    E peek();
}
