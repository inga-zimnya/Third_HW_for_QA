import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите тип конвертируемой величины: ");
        System.out.println("[1] - масса");
        System.out.println("[2] - расстояние");

        int firstChoice = console.nextInt();
        int secondChoice = 0;
        int number = 0;

        double after = 0.0;
        System.out.println("Выберите единицу измерения");

        if(firstChoice == 1){
            System.out.println("[1] - кг");
            System.out.println("[2] - грамм");
            System.out.println("[3] - фунт");
            System.out.println("[4] - карат");
            secondChoice = console.nextInt();

            System.out.println("Введите количество: ");
            number = console.nextInt();

            switch (secondChoice) {
                case (1) -> {
                    System.out.println("килограммы: " + number);
                    System.out.println("граммы: " + number * 1000);
                    System.out.println("фунты: " + number * 2.204623);
                    System.out.println("караты: " + number * 5000);
                }
                case (2) -> {
                    after = (double) number / 1000;
                    System.out.println("килограммы: " + after);
                    System.out.println("граммы: " + after * 1000);
                    System.out.println("фунты: " + after * 2.204623);
                    System.out.println("караты: " + after * 5000);
                }
                case (3) -> {
                    after = (double) number / 2.204623;
                    System.out.println("килограммы: " + after);
                    System.out.println("граммы: " + after * 1000);
                    System.out.println("фунты: " + after * 2.204623);
                    System.out.println("караты: " + after * 5000);
                }
                case (4) -> {
                    after = (double) number / 5000;
                    System.out.println("килограммы: " + after);
                    System.out.println("граммы: " + after * 1000);
                    System.out.println("фунты: " + after * 2.204623);
                    System.out.println("караты: " + after * 5000);
                }
                default -> System.out.println("Вы написали неправильное значение");
            }
        }else if(firstChoice == 2){
            System.out.println("[1] - метр");
            System.out.println("[2] - миля");
            System.out.println("[3] - ярд");
            System.out.println("[4] - фут");
            secondChoice = console.nextInt();

            System.out.println("Введите количество: ");
            number = console.nextInt();

            switch (secondChoice) {
                case (1) -> {
                    System.out.println("метры: " + number);
                    System.out.println("миля: " + (double) number * 0.000621);
                    System.out.println("ярды: " + (double) number * 1.093613);
                    System.out.println("футы: " + (double) number * 3.28084);
                }
                case (2) -> {
                    after = (double) number / 0.000621;
                    System.out.println("метры: " + after);
                    System.out.println("миля: " + (double) after * 0.000621);
                    System.out.println("ярды: " + (double) after * 1.093613);
                    System.out.println("футы: " + (double) after * 3.28084);
                }
                case (3) -> {
                    after = (double) number / 1.093613;
                    System.out.println("метры: " + after);
                    System.out.println("миля: " + (double) after * 0.000621);
                    System.out.println("ярды: " + (double) after * 1.093613);
                    System.out.println("футы: " + (double) after * 3.28084);
                }
                case (4) -> {
                    after = (double) number / 3.28084;
                    System.out.println("метры: " + after);
                    System.out.println("миля: " + (double) after * 0.000621);
                    System.out.println("ярды: " + (double) after * 1.093613);
                    System.out.println("футы: " + (double) after * 3.28084);
                }
                default -> System.out.println("Вы написали неправильное значение");
            }
        }else{
            System.out.println("Вы ввели некорректное значение");
        }

    }
}
