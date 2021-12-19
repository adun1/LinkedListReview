public class LinkedListCaller {
    public static void main(String []args) {
        int insertVal = 5;
        LinkedList items = new LinkedList();
        System.out.println("This is a linked List Skeleton");

        items.print();
        items.insert(new LinkedListNode(-1, insertVal));
        items.print();
        items.delete(items.find(-1));
        items.print();
        
        
        for(int i = 0; i < 10; i++)
            items.insert(new LinkedListNode(i, insertVal));
        
        LinkedListNode a = new LinkedListNode(1000000, insertVal);
        items.insert(a);

        for(int i = 0; i < 10; i++)
            items.insert(new LinkedListNode(10 + i, insertVal));
        items.print();
        
        items.delete(items.find(1000000));
        items.print();

        items.delete(items.find(0));
        items.print();
    }
}