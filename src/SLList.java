public class SLList <T> {

    SLNode head;
    SLNode tail;
    int size;

    //constuctor
    public SLList(){
        SLNode head = null;
        SLNode tail = null;
        int size;

    }
public void listAdd(T p){
        // create the new node using the input from the method call
SLNode newNode = new SLNode(p);
//check head null if true, assign this new node to head
    if (head==null){
    head = newNode;
    tail = newNode;
    }
    else{
        // point the tail pointer to the added node, then we update the tail to the new node
        tail.next = newNode;
        // update tail
        tail = newNode;
    }
// update size of the list to reflect the change
    size++;
}

public void listRemove(int pos){
        // first check if valid index passed as argument is valid
        if(pos<0 || pos > size){
    System.out.println("Error: the index to be deleted DNE");
    return;
    }
      //check if we are removing the head node,because we need the head node to iterate over the linked list
      //therefore head is a special case
    if(pos == 0){
        head = head.next;
    }
    else{
        //delete the node now, that we have confirmed it is valid index and not head

        //iterator ptr to iterate the list starting from head -> pos-1
        SLNode itr = head;
        for(int i = 0; i<pos-1; i++){
            itr = itr.next;
        }
       // use the itr at pos -1 to point to pos+1 itr !->x pos itr -> pos+1
        itr.next = itr.next.next;

        // check if pos was the tail
        if(pos == size-1){
            //set tail to pos -1 which is where the itr is at the end of the for loop
            tail = itr;
        }
    }
    //update size to reflect the change
    size--;
}


public String toString() {
    if(size == 0 ){
        return "Empty list";
    }
        //itr to iterate through the list
    String to_return = "";
    SLNode itr = head;
    while(itr != null){

        //concact all the information to the return string
        to_return += (itr.object.toString() +"\n");

        //move to next item in list
        itr = itr.next;
    }

    return to_return;
    }
}
