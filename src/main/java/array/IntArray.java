package array;

import java.util.Arrays;

/**
 * 自己实现一个Array
 *
 * @author xiaozefeng
 * @date 2018/5/9 下午2:18
 */
public class IntArray {

    /**
     * 内部数组
     */
    private int[] data;

    /**
     * 数组中实际有多少个元素
     */
    private int size;

    /**
     * 构造函数，根据 capacity 构造Array
     *
     * @param capacity
     */
    public IntArray(int capacity) {
        data = new int[capacity];
    }

    public IntArray() {
        this(10);
    }

    /**
     * 返回数组中实际有多少个元素
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 返回数组中容量
     *
     * @return
     */
    public int capacity() {
        return data.length;
    }

    /**
     * 向尾部添加元素
     *
     * @param e
     */
    public void append(int e) {
        this.insert(size, e);
    }

    /**
     * 向数组头部插入数据
     *
     * @param e
     */
    public void insertFirst(int e) {
        this.insert(0, e);
    }

    /**
     * 向数组的指定位置插入元素
     *
     * @param index
     * @param e
     */
    public void insert(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("Insert failed. Array is full.");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Insert failed. Required index >= 0 and index <= size");
        }
        // 将index后面的元素往后移
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 根据索引获取元素
     *
     * @param index
     * @return
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal");
        }
        return data[index];
    }

    /**
     * 设置指定index的值
     *
     * @param index
     * @param e
     */
    public void set(int index, int e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal");
        }
        data[index] = e;
    }

    /**
     * 数组是否包含此元素
     *
     * @param e
     * @return
     */
    public boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return true;
            }
        }
        return false;
    }

    /**
     * 查询数组中此元素的索引值
     *
     * @param e
     * @return 不存在是返回-1
     */
    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除数组中指定位置的元素
     *
     * @param index
     * @return 返回被删除的元素
     */
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Index is illegal");
        }
        int ret = data[index];
        // 将index位置后的元素前移一位
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return ret;
    }


    /**
     * 删除数组中的第一个元素
     *
     * @return
     */
    public int removeFirst() {
        return remove(0);
    }

    /**
     * 删除数组中最后一个元素
     *
     * @return
     */
    public int removeLast() {
        return remove(size - 1);
    }

    /**
     * 删除数组中的指定元素
     * @param e
     */
    public void removeElement(int e){
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    @Override
    public String toString() {
        return String.format("[Capacity: %d, Size: %d, Data: %s]", data.length, size, Arrays.toString(data));
    }
}
