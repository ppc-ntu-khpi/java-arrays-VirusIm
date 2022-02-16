package domain;
import java.util.Random;

public class Exercise {
    /**
     * Метод выводит все рандомные числа массива в заданном диапазоне.
     * @param r диапаон который задан пользователем
     */
    public static void Calculate(int r){
        /**
         * <code>iLength</code> – создан для того чтобы не выйти за диапазон массива
         * <code>rand</code> – генирирует рандомные числа
         */
        int iLength = 0;
        Random rand  = new Random();
        int[] array = new int[14];
        do
        {
            /**
             * цикл работает пока не достигнет длины массива
             * <code>j</code> – создан для проверки числа на кол-ко делителей
             * <code>count</code> – хранит в себе кол-во делителей определённого числа
             */
            int i = 0;
            array[i] = rand.nextInt(r);
            if(array[i] < 1) continue;  //прерывает код если число меньше 1-цы
            int j = array[i];
            int count = 0;
            for(int k = 1; k <= j; k++) //считает кол-во делителей числа
            {
                if(j % k == 0) count++;
            }
            if(count <= 2)  //если кол-во делителей не привышает 2-х
            {
                System.out.print("i = " + array[i] + ", ");
                iLength++;
            }
        }while(iLength != array.length);
        System.out.println();
    }
}
