package app;

// Класс наследует класс-модель,
public class MerchantA extends Merchant {

    String email;

    // Конструктор этого класса
    public MerchantA(String name, String phone, String email) {
        super(name, phone);
        this.email = email;
    }
    // Метод этого класса
    public String infoMerchant() {
        String name = getName();
        String phone = getPhone();
        return "Продавец: " + name + ", " + phone + ", " + email + "\n";
    }
}

