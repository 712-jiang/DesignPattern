package Iterator.v2;

/**
 * @author 712
 * @function:
 * @create 2021/4/15 17:45
 */
public class LinkedList_ implements Collection_ {
    Node head;
    Node tail;
    private int size=0;
    @Override
    public void add(Object o) {
        Node n = new Node(o);
        n.next = null;
        if(head==tail){
            head = n;
            tail = n;
        }
        tail.next = n;
        tail = n;
        size ++;
    }

    @Override
    public void size() {
        System.out.println(size);
    }

    private class Node{
        Object val;
        Node next;

        public Node(Object val) {
            this.val = val;
        }
    }

    @Override
    public Iterator_ iterator() {
        return null;
    }

    private class linkedListIterator implements Iterator_{
        private int currentindex = 0;

        @Override
        public boolean hasNext() {
            if(head == null) return false;
            return true;
        }

        @Override
        public Object next() {
            Object o = head.val;
            head = head.next;
            return o;
        }
    }
}
