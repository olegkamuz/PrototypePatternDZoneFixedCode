package Prototype;

public class Client {
    public static void main(String[] args) {
        ItemRegistry registry = new ItemRegistry();
        Book myBook = (Book) registry.createBasicItem("Book");
        myBook.setTitle("Custom Title");
        System.out.println(myBook.getTitle());
    }
}
