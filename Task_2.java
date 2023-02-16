
/**
 * Пусть дан список сотрудников:
 * Светлана Петрова
 * Кристина Белова
 * Анна Мусина
 * Анна Крутова
 * Иван Юрин
 * Петр Лыков
 * Павел Чернов
 * Петр Чернышов
 * Мария Федорова
 * Марина Светлова
 * Иван Савин
 * Мария Рыкова
 * Марина Лугова
 * Анна Владимирова
 * Иван Мечников
 * Петр Петин
 * Иван Ежов
 * 
 * Написать программу, которая найдет и выведет повторяющиеся имена с
 * количеством повторений.
 * Отсортировать по убыванию популярности.
 * 
 * Иван 4, ...
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Task_2 {
    public static void main(String[] args) {
        String[] staff = new String[] {
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Иван Савин",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов" };
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < staff.length; i++) {
            String[] name = staff[i].split(" ");
            names.add(name[0]);
        }

        Map<String, Integer> map = new HashMap<>();
        for (String item : names) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }

        int count = Collections.max(map.values());
        for (int j = count; j > 1; j--) {
            for (var item1 : map.entrySet()) {
                if (item1.getValue() == j) {
                    System.out.println(item1);
                }
            }
        }
    }
}
