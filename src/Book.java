public class Book {
        private final String title;
        private final String author;

        private final double price;

        //constructor
    public Book(String title, String author, double price){
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public String toString () {
            return ("Book title: " + title + ", author: " + author + "price: " + price);
        }

    }
