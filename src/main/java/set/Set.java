package set;

/**
 * 集合
 *
 * @author xiaozefeng
 * @date 2018/5/18 下午9:15
 */
public interface Set<E> {
    /**
    * 添加元素
    */
    void add(E e);

    /**
    * 删除元素
    */
    void remove(E e);
    /**
    * 是否包含某个元素
    */
    boolean contains(E e);
    /**
    * size
    */
    int size();
    
    /**
    * 是否为空
    */
    boolean isEmpty();
}
