package HWLesson1;
/* Пришлось создать новый package и класс чтобы создать пулл реквест*/
public class HWlesson1 {
        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
        }
        public static void printThreeWords() {
            System.out.println(" Orange" + " Banana\n" + " Apple\n");
        }
        public static void checkSumSign() {
            int a= 17, b = 19, c=0;
            c = a-b;
            if (c>=0){
                System.out.println("Сумма положмтельная");
            }
            else {
                System.out.println("Сумма отрицательная");
            }
        }
        public static void printColor() {
            int value = -119;
            if(value <= 0){
                System.out.println("Красный");
            }
            if ((value>0)&&(value<=100)){
                System.out.println("Желтый");
            }
            else{
                System.out.println("Зеленый");
            }
        }
        public static void compareNumbers() {
            int a=84, b= 46;
            if(a>=b){
                System.out.println("a>=b");
            }
            else{
                System.out.println("a<b");
            }
        }
    }


