package rzd.company;
/*
Вывести все простые числа от 2 до 100
*/
public class PrimeNumber {
    public static void main(String[] args) {
        int max = 100;
        int kold = 0; //счетчик кол-ва делений числа

        for(int i = 2; i < max; i++){
            for(int x = 1; x <= i; x++){  // проверяем деление на Х (начиная с 1)
                if (i % x == 0){
                    kold++;
                }
            }
            if (kold == 2){   // кол-во делений = 2, то выводим в консоль
                System.out.println(i);
                kold = 0;
            }
            else{
                kold = 0;
            }
        }

    }
}
