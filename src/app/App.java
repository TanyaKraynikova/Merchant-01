package app;

import java.util.Scanner;

// Класс-входная точка в приложение.
// App launcher.
public class App {

    static String merchantName;
    static String email;
    static String phone;
    static String productName;
    static int quantity;
    static double price;
    static String roundBonus;
    static ProductA product;
    static MerchantA merchantA;
    static String infoMerchant;
    static String infoProduct;


    public static void main(String[] args) {

    }
    // Инициализация переменных.
    // Имитация ввода данных пользователем.
    private static void initVars() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter merchant name: ");
        merchantName = scanner.nextLine();

        System.out.println("Enter merchant email: ");
        email = scanner.nextLine();

        System.out.println("Enter merchant phone: ");
        phone = scanner.nextLine();

        System.out.println("Enter productName: ");
        productName = scanner.nextLine();

        System.out.println("Enter quantity product: ");
        quantity  = scanner.nextInt();

        System.out.println("Enter product price:");
        price  = scanner.nextDouble();
    }

    // Передача данных на обработку.
    // Вызовы методов через экземпляры классов
    // для получения результатов расчетов.
    private static String processData() {
        merchantA = new MerchantA(merchantName, phone, email);
        infoMerchant = merchantA.infoMerchant();
        product = new ProductA(productName, quantity, price);
        infoProduct = product.infoProduct();
        double sales = product.calcSales(quantity, price);
        roundBonus = Rounder.roundValue(merchantA.calcBonus(sales));
        return infoMerchant + infoProduct + "\nБонус (грн.): " + roundBonus;
    }
}
