package stack;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class ArrayStackTest {

    @Test
    public void pushAndPop(){
        Stack<Integer> stack = new ArrayStack<>();
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