package stack;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class LinkListStackTest {

    @Test
    public void pushAndPop(){
        Stack<Integer> stack = new LinkListStack<>();
        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }
        log.info("{}", stack);

        for (int i = 0; i < 10; i++) {
            stack.pop();
        }
        log.info("{}", stack);
    }

}