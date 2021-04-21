package Composite;

/**
 * @author 712
 * @function:
 * @create 2021/4/14 10:13
 */
public class LeafNode extends Node{
    private String content;

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    public void p() {
        System.out.println(content);
    }
}
