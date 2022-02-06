public class Main {
    public static void main(String[] args) {

        //Входные данные
        int balance = 100; //Текущий баланс
        int pay = 1001; //Пополнение счета
        int percent = 1; //Процент бонусов
        int bonuses = 0; //Начальное количество бонусов

        if (pay > 1000) {
            bonuses = pay * percent / 100; //Расчет бонусов
            balance = bonuses + balance + pay; //Без округдения.
            //balance = pay / 100 * percent + balance + pay; // С округлением.
        } else {
            balance = balance + pay;
        }
        System.out.println("Текущий баланс: " + balance);
        System.out.println("Количество начисленных бонусов: " + bonuses);

    }
}
