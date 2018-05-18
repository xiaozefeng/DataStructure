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
        System.out.println(bst);
    }





}