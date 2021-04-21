package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 712
 * @function:
 * @create 2021/4/14 10:15
 */
public class BranchNode extends Node{
    List<Node> nodes = new ArrayList<>();
    String name;
    public BranchNode(String name){
        this.name = name;
    }

    public void add(Node n){
        nodes.add(n);
    }

    @Override
    public void p() {
        System.out.println(name);
    }
}
