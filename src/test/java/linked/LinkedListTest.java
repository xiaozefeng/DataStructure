package linked;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class LinkedListTest {


    @Test
    public void test(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            log.info("{}", linkedList);
        }
        linkedList.insert(2, 666);
        log.info("{}", linkedList);
        linkedList.removeFirst();
        log.info("{}", linkedList);
        linkedList.removeLast();
        log.info("{}", linkedList);
    }

}