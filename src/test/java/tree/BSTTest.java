package tree;

import javafx.scene.layout.BorderStrokeStyle;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTTest {


    @Test
    public void addTest(){
        BST<Integer> bst = new BST<>();
        bst.add(20);
        bst.add(18);
        bst.add(23);
        bst.add(26);
        System.out.println("----前序遍历-----");
        bst.preOrder();

        System.out.println("----非递归的前序遍历-----");
        bst.preOrderNR();

        System.out.println("----中序遍历-----");
        bst.inOrder();
        System.out.println("-----后序遍历----");
        bst.postOrder();
        System.out.println("---------");
        //System.out.println(bst);

        System.out.println("-------层序遍历--------");
        bst.levelOrder();
    }

    @Test
    public void minimumTest(){
        BST<Integer> bst = new BST<>();
        bst.add(20);
        bst.add(18);
        bst.add(23);
        bst.add(2);
        bst.add(1);
        bst.add(0);
        bst.add(-1);
        bst.add(1);
        System.out.println(bst.minimum());
    }


    @Test
    public void maximumTest(){
        BST<Integer> bst = new BST<>();
        bst.add(20);
        bst.add(18);
        bst.add(23);
        bst.add(2);
        bst.add(1);
        bst.add(0);
        bst.add(-1);
        bst.add(128);
        System.out.println(bst.maximum());
    }

    @Test
    public void removeMinTest(){
        BST<Integer> bst = new BST<>();
        bst.add(20);
        bst.add(18);
        bst.add(23);
        bst.add(2);
        bst.add(1);
        bst.add(0);
        bst.add(-1);
        bst.add(128);
        bst.removeMin();
        bst.removeMin();
        bst.removeMin();
        bst.removeMin();
        System.out.println(bst);
    }


    @Test
    public void removeMaxTest(){
        BST<Integer> bst = new BST<>();
        bst.add(20);
        bst.add(18);
        bst.add(23);
        bst.add(2);
        bst.add(1);
        bst.add(0);
        bst.add(-1);
        bst.add(128);
        bst.removeMax();
        bst.removeMax();
        bst.removeMax();
        bst.removeMax();
        bst.removeMax();
        System.out.println(bst);
    }



}