import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите тип конвертируемой величины: ");
        System.out.println("[1] - масса");
        System.out.println("[2] - расстояние");

        int firstChoice = console.nextInt();
        int secondChoice = 0;
        double after = 0.0;
        System.out.println("Выберите единицу измерения");

        if(firstChoice == 1){
            System.out.println("[1] - кг");
            System.out.println("[2] - грамм");
            System.out.println("[3] - фунт");
            System.out.println("[4] - карат");
            secondChoice = console.nextInt();
            switch (secondChoice){
                case(1):
                    System.out.println("килограммы: " + secondChoice);
                    System.out.println("граммы: " + secondChoice * 1000);
                    System.out.println("фунты: " + secondChoice * 2.204623);
                    System.out.println("караты: " + secondChoice * 5000);
                    break;
                case(2):
                    after = (double)secondChoice / 1000;
                    System.out.println("килограммы: " + after);
                    System.out.println("граммы: " + after * 1000);
                    System.out.println("фунты: " + after * 2.204623);
                    System.out.println("караты: " + after * 5000);
                    break;
                case(3):
                    after = (double)secondChoice / 2.204623;
                    System.out.println("килограммы: " + after);
                    System.out.println("граммы: " + after * 1000);
                    System.out.println("фунты: " + after * 2.204623);
                    System.out.println("караты: " + after * 5000);
                    break;
                case(4):
                    after = (double)secondChoice / 5000;
                    System.out.println("килограммы: " + after);
                    System.out.println("граммы: " + after * 1000);
                    System.out.println("фунты: " + after * 2.204623);
                    System.out.println("караты: " + after * 5000);
                    break;
                default:
                    System.out.println("Вы написали неправильное значение");
            }
        }else if(firstChoice == 2){
            System.out.println("[1] - метр");
            System.out.println("[2] - миля");
            System.out.println("[3] - ярд");
            System.out.println("[4] - фут");
            secondChoice = console.nextInt();
            switch (secondChoice){
                case(1):
                    System.out.println("метры: " + secondChoice);
                    System.out.println("миля: " + (double)secondChoice * 0.000621);
                    System.out.println("ярды: " + (double)secondChoice * 1.093613);
                    System.out.println("футы: " + (double)secondChoice * 3.28084);
                    break;
                case(2):
                    after = (double)secondChoice / 0.000621;
                    System.out.println("метры: " + after);
                    System.out.println("миля: " + (double)after * 0.000621);
                    System.out.println("ярды: " + (double)after * 1.093613);
                    System.out.println("футы: " + (double)after * 3.28084);
                    break;
                case(3):
                    after = (double)secondChoice / 1.093613;
                    System.out.println("метры: " + after);
                    System.out.println("миля: " + (double)after * 0.000621);
                    System.out.println("ярды: " + (double)after * 1.093613);
                    System.out.println("футы: " + (double)after * 3.28084);
                    break;
                case(4):
                    after = (double)secondChoice / 3.28084;
                    System.out.println("метры: " + after);
                    System.out.println("миля: " + (double)after * 0.000621);
                    System.out.println("ярды: " + (double)after * 1.093613);
                    System.out.println("футы: " + (double)after * 3.28084);
                    break;
                default:
                    System.out.println("Вы написали неправильное значение");
            }
        }else{
            System.out.println("Вы ввели некорректное значение");
        }

    }
}
