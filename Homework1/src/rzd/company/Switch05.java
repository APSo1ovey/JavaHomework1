package rzd.company;
/*
Присвоить переменной значение в промежутке [0..5].
С помощью оператора switch организовать вывод чисел от «a» до 5
*/
import javax.swing.*;

public class Switch05 {
    public static void main(String[] args) {
        int max = 5;

        int number = Integer.parseInt(JOptionPane.showInputDialog("Задайте число от 0 до 5"));
        switch (number) {
            case 0:
                for (int i = number; i <= 5; i++)
                    System.out.println(i);
                break;
            case 1:
                for (int i = number; i <= 5; i++)
                    System.out.println(i);
                break;
            case 2:
                for (int i = number; i <= 5; i++)
                    System.out.println(i);
                break;
            case 3:
                for (int i = number; i <= 5; i++)
                    System.out.println(i);
                break;
            case 4:
                for (int i = number; i <= 5; i++)
                    System.out.println(i);
                break;
            case 5:
                System.out.println(max);
                break;
            default:
                System.out.println("Введённое число выходит за допустимый диапазон от 0 до 5");
        }
    }
}
