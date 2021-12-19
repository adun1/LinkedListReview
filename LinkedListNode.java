public class LinkedListNode {
    private int key; 
    private int value; //change to accept any type
    private LinkedListNode next;

    public LinkedListNode() {
        this.next = null;
    }

    public LinkedListNode(int key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public int getValue(){
        return value;
    }

    public int getKey(){
        return key;
    }

    public void setValue(int value){
        this.value = value;
    }

    public LinkedListNode getNext(){
        return next;
    }

    public void setNext(LinkedListNode next){
        this.next = next;
    }
}