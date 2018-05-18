package recursion;

import org.junit.Test;

/**
 * @author xiaozefeng
 * @date 2018/5/12 下午6:22
 */
public class RecursionTest {

    @Test
    public void sumTest() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = sum(arr);
        System.out.println(result);
    }

    private int sum(int[] arr) {
        return sum(arr, 0);
    }

    /**
     * 递归计算数组的和
     *
     * @param arr 数组
     * @param l   作边界
     * @return
     */
    private int sum(int[] arr, int l) {
        if (l == arr.length) {
            return 0;
        }
        // 将数组拆解成 arr[n] + sum(arr, n+1)
        return arr[l] + sum(arr, l + 1);
    }

}
