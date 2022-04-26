import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму пополнения: ");
        int refill = in.nextInt();

        int startigScore = 0; // Начальный счет
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
