import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите тип конвертируемой величины: ");
        System.out.println("[1] - масса");
        System.out.println("[2] - расстояние");

        int firstChoice = console.nextInt();
        System.out.println("Выберите единицу измерения");

        if(firstChoice == 1){
            System.out.println("[1] - кг");
            System.out.println("[2] - грамм");
            System.out.println("[3] - фунт");
            System.out.println("[4] - карат");
        }else if(firstChoice == 2){
            System.out.println("[1] - метр");
            System.out.println("[2] - миля");
            System.out.println("[3] - ярд");
            System.out.println("[4] - фут");
        }else{
            System.out.println("Вы ввели некорректное значение");
        }

        
    }
}
