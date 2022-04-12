package app;

// Класс наследует класс-модель,
public class ProductA extends Product {

    int qnty;
    double price;

    // Конструктор этого класса
    public ProductA(String name, int qnty, double price) {
        super(name);
        this.qnty = qnty;
        this.price = price;
    }
}
