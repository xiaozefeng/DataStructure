package array;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.LazyReflectiveObjectGenerator;

import static org.junit.Assert.*;

@Slf4j
public class ArrayTest {

    @Test
    public void append() {
        Array<Integer> array = new Array<>();
        for (int i = 0; i < 20; i++) {
            array.append(i);
        }
        Assert.assertEquals(array.capacity(), 20);
        Assert.assertEquals(array.size(), 20);
        log.info("{}", array);

    }

    @Test
    public void removeLast() {
        Array<Integer> array = new Array<>();
        for (int i = 0; i < 20; i++) {
            array.append(i);
        }
        for (int i = 0; i < 11; i++) {
            array.removeLast();
        }
        Assert.assertEquals(array.size(), 9);
        Assert.assertEquals(array.capacity(), 10);
        log.info("{}", array);
    }
}