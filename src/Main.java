// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static  void main (String[]a) {

       Book book1 = new Book("One piece", "Oda",19.99);
       Book book2 = new Book("Bleach","Kubo",15.99);

        // this is to test the arr list
        Alist booksList = new Alist();

        System.out.println("Array list testing: "+"\n");
        // first check to print empty list
       System.out.println (booksList.toString());

       booksList.listAdd(book1);
       booksList.listAdd(book2);
       booksList.listAdd(book1);
       booksList.listAdd(book2);
        System.out.println (booksList.toString());

      //  remove an element at pos 1
       booksList.listRemove(1);
       System.out.println (booksList.toString());

//this code tests the linked list class
        System.out.println("Linked list testing: "+"\n");
            SLList booksList2 = new SLList();
            System.out.println (booksList2.toString());

            booksList2.listAdd(book1);
            booksList2.listAdd(book2);
            booksList2.listAdd(book1);
            booksList2.listAdd(book2);
            System.out.println (booksList2.toString());

            //remove an element at pos 1
            booksList2.listRemove(1);
            System.out.println (booksList2.toString());


        //this code tests the double linked list class
        System.out.println("Double Linked list testing: "+"\n");
        DLList booksList3 = new DLList();
        System.out.println (booksList3.toString());

        booksList3.listAdd(book1);
        booksList3.listAdd(book2);
        booksList3.listAdd(book1);
        booksList3.listAdd(book2);
        System.out.println (booksList3.toString());

        //remove an element at pos 1
        booksList3.listRemove(1);
        System.out.println (booksList3.toString());


    }


}