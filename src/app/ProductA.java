package app;

// Класс наследует класс-модель,
// и реализует интерфейс базового функционала Товара.
public class ProductA extends Product implements Sales{

    int qnty;
    double price;

    // Конструктор этого класса
    public ProductA(String name, int qnty, double price) {
        super(name);
        this.qnty = qnty;
        this.price = price;
    }
    // Метод этого класса переопределяющий метод интерфейса
    @Override
    public double calcSales(int quota, double price) {
        return quota * price;
    }
}

