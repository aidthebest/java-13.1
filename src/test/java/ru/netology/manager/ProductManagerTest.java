package ru.netology.manager;

import ru.netology.domain.Book;
import ru.netology.domain.TShirt;

public class ProductManagerTest {
    private ProductManager manager = new ProductManager();

    private Book book1 = new Book(11, "WAR", 2500, "SomeBodyGuy", 15, 25);
    private Book book2 = new Book(49, "Peace", 1748, "AnotherGuy", 78, 78);
    private Book book3 = new Book(19, "HowTocook", 2500, "BadGuy", 87, 21);

    private TShirt smart1 = new TShirt(67, "C30", 17800, "Samsung", "wefwe");
    private TShirt smart2 = new TShirt(57, "3110", 74000, "Nokia", "sdfsdf");
    private TShirt smart3 = new TShirt(84, "11plus", 17800, "Apple", "f34fs");


}
