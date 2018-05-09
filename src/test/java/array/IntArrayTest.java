package array;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class IntArrayTest {


    @Test
    public void size() {
        IntArray array = new IntArray(20);
        Assert.assertEquals(array.size(), 0);
    }

    @Test
    public void capacity() {
        IntArray array = new IntArray(20);
        Assert.assertEquals(array.capacity(), 20);
    }

    @Test
    public void append() {
        IntArray array = new IntArray(20);
        array.append(1);
        array.append(2);
        array.append(3);
        array.append(4);
        Assert.assertEquals(array.size(), 4);
        log.info("append: {}", array);
    }

    @Test
    public void insert() {
        IntArray array = new IntArray(20);
        array.append(1);
        array.append(2);
        array.append(3);
        array.insert(1, 100);
        Assert.assertEquals(array.size(), 4);
        log.info("insert: {}", array);
    }

    @Test
    public void insertFirst() {
        IntArray array = new IntArray(10);
        array.insertFirst(100);
        array.append(200);
        array.insertFirst(300);
        Assert.assertEquals(array.size(), 3);
        log.info("insertFirst:{}", array);
    }
}