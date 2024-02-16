public class DLNode <T>{

    T object;

    DLNode<T> next;
    DLNode<T> prev;

    public DLNode(T object){
        this.object = object;

        this.next = null;
        this.prev = null;
    }

}
