public class LinkedList {
    private LinkedListNode head;
    private LinkedListNode tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    //insert at back of the list to start
    public void insert(LinkedListNode newItem) {
        //case empty list
        if (head == null)
        {
            this.head = newItem;
            this.tail = newItem;
            return;
        }
        
        //case at least on item is currently in list
        LinkedListNode current = head;
        while(current.getNext() != null)
            current = current.getNext();
        current.setNext(newItem);
        this.tail = newItem;
    }

    public void delete() {

    }

    public void print() {
        //case empty list
        if(head == null)
            return;
        
        LinkedListNode current = head;
        while(current != null)
        {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}