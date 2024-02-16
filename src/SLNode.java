public class SLNode <T>{


    //obj data
   T object;
    //points to next obj in list
    SLNode<T> next;
    // takes in a book, sets the node to the input, single linked list needs next pointer thus next
    public SLNode(T object){
        this.object = object;
        this.next = null;
    }
}
