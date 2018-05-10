package queue;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class LinkedListQueueTest {


    @Test
    public void test(){
        Queue<Integer> queue = new LinkedListQueue<>();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            log.info("{}",queue);
            if (i % 3 == 2) {
                queue.dequeue();
                log.info("{}",queue);
            }
        }
    }

}