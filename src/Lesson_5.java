import java.util.Scanner;

public class Lesson_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // .in гирфтани маълумот аз истифодабаранда
//        scanner.nextLine(); // дархост кардани маълумот аз истифодабаранда

//        System.out.print("Номи худро ворид кунед: "); // маълумот барои истифодабаранда
//        String user_name = scanner.nextLine(); //дархости маълумот аз истифодабаранда
//        System.out.println("Салом, " + user_name); //пешниҳод кардани маълумоти воридкардашуда барои истифодабаранда

        // Гирифтани маълумотҳои рақамӣ аз истифодабаранда:
//        int num1 = scanner.nextInt();   //дар ин ҳолат танҳо маълумотҳои рақами ворид карда мешаванд ҳангоми ворид кардани маълумотҳои сатри ба хатоги дучор мешавем

        // Калкулятори одди:
        System.out.print("Рақами якумро ворид кунед: ");
        int num1 = scanner.nextInt();
        System.out.print("Рақами дуюмро ворид кунед: ");
        int num2 = scanner.nextInt();

        int res1 = num1 + num2;
        int res2 = num1 - num2;
        int res3 = num1 * num2;
        int res4 = num1 / num2;

        System.out.print(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);

    }
}
