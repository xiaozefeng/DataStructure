package queue;

import java.util.Random;

/**
 * @author xiaozefeng
 * @date 2018/5/9 下午10:53
 */
public class Main {

    public static void main(String[] args) {
        int opCount = 100000;
        Queue<Integer> arrayQueue = new ArrayQueue<>();
        System.out.println("Array Queue 花费了" + testQueue(arrayQueue, opCount) + "秒");
        Queue<Integer> loopQueue = new LoopQueue<>();
        System.out.println("LoopArray Queue 花费了" + testQueue(loopQueue, opCount) + "秒");

        Queue<Integer> linkedListQueue = new LinkedListQueue<>();
        System.out.println("LinkedList Queue 花费了" + testQueue(linkedListQueue, opCount) + "秒");
    }

    public static double testQueue(Queue<Integer> q, int opCount) {
        long startTime = System.nanoTime();
        Random random = new Random(Integer.MAX_VALUE);
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt());
        }
        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
}
