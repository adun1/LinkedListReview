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
        tail.setNext(newItem);
        this.tail = newItem;
    }

    //needs more testing
    public void delete(LinkedListNode item) {
        //case empty list
        if (head == null)
            return;
        
        //case head
        if (head == item)
        {
            this.head = item.getNext();
            if(head == null)
                this.tail = null;
            return;
        }
        
        LinkedListNode current = head;
        while(current.getNext() != null)
        {
            if(current.getNext() == item)
            {
                if(item.getNext() == null)
                    this.tail = current;
                current.setNext(item.getNext());
                return;
            }
            current = current.getNext();
        }
        
        
    }

    public void print() {
        //case empty list
        System.out.println("printing items");
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