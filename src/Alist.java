public class Alist<T>{
    private int maxSize = 10;
    private int size = 0;

    private T[] Arr_list;

    public Alist() {
        Arr_list = (T[])new Object[maxSize];
    }
    //public Book[] Arr_book_list = new Book[maxSize];
    //method to add book to array list
    public void listAdd(T p) {
        // check if array list  is full

        if (size == maxSize) {
            int new_maxSize = maxSize * 2;
            T[] new_Arr_list = (T[])new Object[new_maxSize];
            for (int i = 0; i < Arr_list.length; i++) {
                new_Arr_list[i] = Arr_list[i];
            }
            Arr_list = new_Arr_list;
            maxSize = new_maxSize;

        } else {
            Arr_list[size] = p;
            size++;
        }
    }

    //remove item from array
public void listRemove(int pos) {
    if (size == 0) {
        System.out.println("Error cannot remove, list is empty");
        return;
    }
    for (int i = pos; i < size - 1; i++) {
        //shift everything by 1 to left by 1
        Arr_list[i] = Arr_list[i+1];
    }
    //update the empty spot to null
    Arr_list[size] = null;
    //update size
    size--;
}


public String toString(){
        if(size == 0 ){
            return "Empty list";
        }
        String all_elements = "";

        for(int i = 0; i< size;i++){
            all_elements += Arr_list[i].toString()+ "\n";
        }

        return all_elements;
}
}