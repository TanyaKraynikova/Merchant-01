package app;

// Класс наследует класс-модель,
// и реализует интерфейс базового функционала Продавца.
public class MerchantA extends Merchant implements Bonus {

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
    // Метод этого класса переопределяющий метод интерфейса.
    @Override
    public double calcBonus(double sales) {
        double bonus;
        if (sales <= 10000) {
            bonus = sales * 5 / 100;
        } else if (sales > 10000 && sales <= 30000) {
            bonus = sales * 10 / 100;
        } else {
            bonus = sales * 15 / 100;
        }
        return bonus;
    }
}

