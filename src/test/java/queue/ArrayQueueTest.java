package queue;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class ArrayQueueTest {

    @Test
    public void test(){
        Queue<Integer> queue = new ArrayQueue<>();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            log.info("{}",queue);
            if (i % 3 == 0) {
                queue.dequeue();
            }
        }
    }

}