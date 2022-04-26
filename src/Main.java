public class Main {
    public static void main(String[] args) {
        int startigScore = 100; // Начальный счет
        int refill = 1000; // Пополнение счета
        int finalScore = startigScore + refill; // Итоговый счет
        int bonus = refill / 100; // Количество бонусов

        if (refill > 1000) {
            System.out.println("Вам начислено: " + bonus + " бонусов");
            System.out.println("Ваш счет на текущий момент: " + (finalScore + bonus));
        } else {
            System.out.println("Вам начислено: " + 0 + " бонусов");
            System.out.println("Ваш счет на текущий момент: " + (finalScore));
        }
    }
}
