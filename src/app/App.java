package app;

// Класс-входная точка в приложение.
// App launcher.
public class App {

    static String merchantName;
    static String email;
    static String phone;
    static String productName;
    static int quantity;
    static double price;
    static String infoMerchant;
    static String infoProduct;


    public static void main(String[] args) {

    }
    // Инициализация переменных.
    // Имитация ввода данных пользователем.
    private static void initVars() {
        merchantName = "Роберт";
        email = "bob@mail.com";
        phone = "055 123-4567";
        productName = "апельсины";
        quantity = 1000;
        price = 19.99;
    }
}
