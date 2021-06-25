package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.TShirt;
import ru.netology.exception.NotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();

    private Book book1 = new Book(11, "WAR", 2500, "SomeBodyGuy", 15, 25);
    private Book book2 = new Book(49, "Peace", 1748, "AnotherGuy", 78, 78);
    private Book book3 = new Book(19, "HowTocook", 2500, "BadGuy", 87, 21);

    private TShirt shirt1 = new TShirt(67, "C30", 17800, "Samsung", "wefwe");
    private TShirt shirt2 = new TShirt(57, "3110", 74000, "Nokia", "sdfsdf");
    private TShirt shirt3 = new TShirt(84, "11plus", 17800, "Apple", "f34fs");


    @Test
    void removeById1() {
        repository.save(book1);
        repository.save(book2);
        repository.save(book3);

        repository.save(shirt1);
        repository.save(shirt2);
        repository.save(shirt3);

        repository.removeById(57);

        Product[] expected = {book1, book2, book3, shirt1, shirt3};
        Product[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void removeById12() {
        repository.save(book1);
        repository.save(book2);
        repository.save(book3);

        repository.save(shirt1);
        repository.save(shirt2);
        repository.save(shirt3);

        assertThrows(NotFoundException.class, ()-> {repository.removeById(75);
        });
    }
}