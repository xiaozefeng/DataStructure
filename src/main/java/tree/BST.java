package tree;

import com.sun.corba.se.spi.ior.iiop.IIOPFactories;
import jdk.nashorn.internal.ir.FunctionCall;
import jdk.nashorn.internal.objects.NativeUint8Array;
import stack.ArrayStack;
import stack.Stack;

import javax.annotation.Resource;
import javax.management.modelmbean.ModelMBean;

/**
 * 二分搜索树
 *
 * @author xiaozefeng
 * @date 2018/5/16 上午10:09
 */
public class BST<E extends Comparable<E>> {

    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    /**
     * 跟节点
     */
    private Node root;

    /**
     * size
     */
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    /**
     * 树的大小
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 二分搜索树是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 向二分搜索树种添加元素
     *
     * @param e
     */
    public void add(E e) {
        root = add(root, e);
    }

    /**
     * 根据一个根节点添加元素,递归算法
     * 并且返回这个根节点
     *
     * @param node
     * @param e
     */
    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }

        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }
        return node;
    }



    /**
     * 查询二分搜索树种是否办好元素E
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        if (e == null) {
            throw new IllegalArgumentException("Call Contains failed. element not allowed null");
        }
        return contains(root, e);
    }

    /**
     * 查询二分搜索树种是否办好元素E，递归算法
     *
     * @param node
     * @param e
     * @return
     */
    private boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }
        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            return contains(node.left, e);
        } else {
            return contains(node.right, e);
        }

    }

    /**
     * 对二分搜索树的前序遍历
     */
    public void preOrder() {
        preOrder(root);
    }

    /**
     * 对node为根做前序遍历
     *
     * @param node
     */
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 前序遍历非递归实现
     */
    public void  preOrderNR(){
        Stack<Node> stack = new ArrayStack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            System.out.println(cur.e);
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
    }

    /**
    * 中序遍历
    */
    public void inOrder() {
      inOrder(root);
    }

    /**
    * 以node为根节点的中序遍历，递归算法
    */
    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    /**
     * 后序遍历
     */
    public void postOrder() {
        postOrder(root);
    }

    /**
    * 以node为根节点做后序遍历
    */
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);
        return res.toString();
    }

    /**
     * 生成以node为根节点，深度为depth的描述二叉树的字符串
     *
     * @param node
     * @param depth
     * @param res
     */
    private void generateBSTString(Node node, int depth, StringBuilder res) {
        if (node == null) {
            res.append(generateDepthString(depth) + "null\n");
            return;
        }
        res.append(generateDepthString(depth) + node.e + "\n");
        generateBSTString(node.left, depth + 1, res);
        generateBSTString(node.right, depth + 1, res);
    }

    private String generateDepthString(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("--");
        }
        return sb.toString();
    }
}

