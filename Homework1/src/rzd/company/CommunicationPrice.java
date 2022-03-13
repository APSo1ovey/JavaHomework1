package rzd.company;
/*
Написать программу определения стоимости разговора по телефону с учетом скидки 20%,
предоставляемой по субботам и воскресеньям. Использовать switch
 */
import javax.swing.*;

public class CommunicationPrice {
    public static void main(String[] args) {
        int price = 150;

        int day = Integer.parseInt(JOptionPane.showInputDialog("Какой сейчас день недели?"));
        switch (day){
            case 1:
                System.out.println("Понедельник. Цена за связь составляет " + price + " рублей");
                break;
            case 2:
                System.out.println("Вторник. Цена за связь составляет " + price + " рублей");
                break;
            case 3:
                System.out.println("Среда. Цена за связь составляет " + price + " рублей");
                break;
            case 4:
                System.out.println("Четверг. Цена за связь составляет " + price + " рублей");
                break;
            case 5:
                System.out.println("Пятница. Цена за связь составляет " + price + " рублей");
                break;
            case 6:
                System.out.println("Суббота. Скидка 20%. Цена за связь составляет " + Math.round(price * 0.8) + " рублей");
                break;
            case 7:
                System.out.println("Воскресение. Скидка 20%. Цена за связь составляет " + Math.round(price * 0.8) + " рублей");
                break;
            default:
                System.out.println("Введённый день недели не существует");
        }
    }
}
