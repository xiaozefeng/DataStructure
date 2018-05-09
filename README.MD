# 数据结构学习
## 为什么要学习数据结构

## 时间复杂度分析
> O(1), O(n), O(lgn)

### 什么是O
> 简单理解: O描述的是算法运行的时间和输入数据之间的关系
#### O(n) example:
```java
    public static int sum(int[] nums){
        int sum = 0;
        for( int num : nums ) sum+=num;
        return sum;
    }
```
n 是数组中元素的个数, 这个算法的运行时间是和数组中元素的个数成线性关系的

#### O(1) : 表示这个算法所消耗的时间和数据的规模是没有关系的
```java
insertLast(e); // O(1)
addFirst(e); // O(n) 
insert(index, e); // O(n/2) = O(n) 
resize(capacity) // O(n)
```
![](http://7xv4mv.com1.z0.glb.clouddn.com/2018-05-09-091525.png)