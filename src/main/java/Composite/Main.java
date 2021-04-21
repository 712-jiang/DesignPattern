package Composite;

import java.util.Arrays;

/**
 * @author 712
 * @function: 树结构
 * @create 2021/4/14 10:13
 */
public class Main {

    public static void main(String[] args) {
        BranchNode root = new BranchNode("Root");
        BranchNode chapter1 = new BranchNode("Chapter1");
        LeafNode node1 = new LeafNode("node1");
        LeafNode node2 = new LeafNode("node2");
        BranchNode chapter2 = new BranchNode("Chapter2");
        BranchNode node3 = new BranchNode("node3");
        LeafNode point31 = new LeafNode("point31");
        LeafNode point32 = new LeafNode("point32");

        root.add(chapter1);
        root.add(chapter2);
        chapter1.add(node1);
        chapter1.add(node2);
        chapter2.add(node3);
        node3.add(point31);
        node3.add(point32);

        //打印这个树
        tree(root,0);
    }
    public static void tree(Node b,int index){
        for(int i=0;i<index;i++) System.out.print("==");
        b.p();
        if(b instanceof BranchNode)
            for(Node n: ((BranchNode) b).nodes) {
                index++;
                tree(n, index);
            }
    }
}
