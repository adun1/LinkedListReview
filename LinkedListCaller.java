public class LinkedListCaller {
    public static void main(String []args) {
        int insertVal = 5;
        LinkedList items = new LinkedList();
        System.out.println("This is a linked List Skeleton");

        //LinkedListNode a = new LinkedListNode(insertVal);
        for(int i = 0; i < 10; i++)
            items.insert(new LinkedListNode(i));
        
        LinkedListNode a = new LinkedListNode(1000000);
        items.insert(a);

        for(int i = 0; i < 10; i++)
            items.insert(new LinkedListNode(10 + i));
        items.print();

        items.delete(a);
        items.print();
    }
}