public class DLList <T>{
DLNode<T> head;
DLNode<T> tail;

int size;

// constructor
  public  DLList(){
        head = null;
        tail = null;
        int size;
    }

    public void listAdd(T p){
        // create the new node using the input from the method call
        DLNode<T> newNode = new DLNode(p);
//check head null if true, assign this new node to head and tail
        if (head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            //update the new nodes prev to tail becuase new node is added at the end
            newNode.prev = tail;
            //update the current tail to reflect the change
            tail.next = newNode;
            // the new tail is the new node now bc it is added at the end
            tail = newNode;
            size++;
        }
    }


    public void listRemove(int pos){
        // first check if valid index passed as argument is valid
        if(pos<0 || pos > size){
            System.out.println("Error: the index to be deleted DNE");
            return;
        }
        // will be used to iterate starting at head
        DLNode<T> itr = head;

        for(int i=0; i<pos;i++){
            itr = itr.next;
        }
        //after for loop we itr = item at pos we want to remove

        //this ptr points to the element after the element we want to delete
        DLNode<T> nextptr = itr.next;

        // now this ptr point to the element before the one we want to delete
        DLNode<T> prevptr = itr.prev;

        // use these to skip over the node we want to remove


        if(prevptr!=null){
            // if not null means not head
            // we run this line of code to essentially skip over the element to be removed
            prevptr.next = nextptr;
        }
        else{
            //we know head is being removed
            //change the head to effectivly remove the first element
            head = nextptr;
        }

        if(nextptr!=null){
            // checks if itr is the tail
            // if not we need to make sure the element after the one we removed points back to the removed -1
            nextptr.prev = prevptr;
        }

        //update size to reflect the change
        size--;
    }


//same as linked list
    public String toString() {
        if(size == 0 ){
            return "Empty list";
        }
        //itr to iterate through the list
        String to_return = "";
        DLNode itr = head;
        while(itr != null){

            //concact all the information to the return string
            to_return += (itr.object.toString() +"\n");

            //move to next item in list
            itr = itr.next;
        }

        return to_return;
    }

}
