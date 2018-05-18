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
    }





}