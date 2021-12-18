public class LinkedListNode {
    private int value; //change to accept any type
    private LinkedListNode next;

    public LinkedListNode() {
        //this.value = null;
        this.next = null;
    }

    public LinkedListNode(int value){
        this.value = value;
        this.next = null;
    }

    public int getValue(){
        return value;
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