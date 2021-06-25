package ru.netology.manager;

import ru.netology.domain.Product;
import ru.netology.repository.ProductRepository;

public class ProductManager {
    private ProductRepository repository = new ProductRepository();

    public ProductManager(ProductRepository product) {
        repository = product;
    }

    public ProductManager() {
    }

    public void add(Product product) {
        repository.save(product);
    }

    public Product[] getAll() {
        return repository.findAll();
    }

    public void removeItemById (int id) {
        repository.removeById(id);
    }

    public Product findItemById (int id) {
        return repository.findById(id);
    }
}
