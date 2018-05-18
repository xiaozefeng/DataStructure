package stack;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @author xiaozefeng
 * @date 2018/5/10 下午9:02
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        int opCount = 10000000;
        Stack<Integer> arrayStack = new ArrayStack<>();
        log.info("arrayStack: {}",testStack(arrayStack, opCount));
        Stack<Integer> linkedListStack = new LinkListStack<>();
        log.info("linkedListStack: {}",testStack(linkedListStack, opCount));
    }

    /**
     * 测试栈性能
     * @param stack
     * @param opCount
     * @return
     */
    private static double testStack(Stack<Integer> stack, int opCount) {
        long start = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            stack.pop();
        }
        long end= System.nanoTime();
        return (end - start) / 1000000000.0;
    }
}
