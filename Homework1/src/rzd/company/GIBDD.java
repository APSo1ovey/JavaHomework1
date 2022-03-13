package rzd.company;
/*
Исправить код задачи с камерой так чтобы штраф был уменьшен в 2 раза если срок оплаты менее 30 дней.
Количество дней со дня штрафа можно ввести через консоль либо сделать рандомно
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GIBDD {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		Кол-во дней с выставления штрафа
// 		Integer day = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
		int day = (int)(Math.random() * (365 - 1) + 1);

		Integer maxAccessSpeed = 30;//макс. разрешенная скорость движения
		Integer speedGrade = 20;//коэффициент штрафа, каждые 20 км/ч штраф увелич. на 500р
		Integer fineGrade = 500;
		Integer dangerSpeed = 180;

        		System.out.println("введите скорость");
		Integer speed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

		if(speed>dangerSpeed) {
			System.out.println("Немедленно остановитесь!");
		}
		else if(speed>maxAccessSpeed) {
			Integer overSpeed = speed - maxAccessSpeed;//скорость превышения
			Integer k = overSpeed/speedGrade;//коэффициент превышения скорости
			Integer fine = k * fineGrade;//величина штрафа
			if (day <= 30){
				System.out.println("Штраф составляет "+fine/2+" руб. Штраф выставлен "+day+" дней назад");}
			else {
				System.out.println("Штраф составляет "+fine+" руб. Штраф выставлен "+day+" дней назад");
			}

		}
		else {
			System.out.println("Доброго пути!");
		}
    }
}

