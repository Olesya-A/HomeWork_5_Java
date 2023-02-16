import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
 * человек может иметь несколько телефонов.
 */
public class Task_1 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        Scanner iScanner = new Scanner(System.in, "Cp866");
        while (true) {
            System.out.print("Введите Имя и Фамилию: ");
            String name = iScanner.nextLine();
            ArrayList<Integer> phones = new ArrayList<Integer>();
            while (true) {
                System.out.print("Введите номер телефона: ");
                String input = iScanner.nextLine();
                int phone = Integer.parseInt(input);
                phones.add(phone);
                System.out.print("Добавить еще номер телефона - да/нет:");
                String confirm2 = iScanner.nextLine().trim().toLowerCase();
                if (confirm2.equals("нет")) {
                    break;
                }
            }
            phoneBook.put(name, phones);
            System.out.print("Добавить еще один контакт - да/нет: ");
            String input3 = iScanner.nextLine().trim().toLowerCase();
            if (input3.equals("нет")) {
                break;
            }
        }
        System.out.println("Ваша телефонная книга:");
        for (String item : phoneBook.keySet()) {
            System.out.printf("%s: \n", item);
            for (int i = 0; i < phoneBook.get(item).size(); i++) {
                System.out.println(phoneBook.get(item).get(i));
            }
        }
        iScanner.close();
    }
}