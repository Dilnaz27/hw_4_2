import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        System.out.println("Введите 5 строк.");
        for (int i = 0; i < 5; i++) {
            a.add(scanner.next());
        }
        System.out.println("Список А: " + a);

        Scanner scanner1 = new Scanner(System.in);
        ArrayList<String> b = new ArrayList<>();
        System.out.println("Введите 5 строк.");
        for (int i = 0; i < 5; i++) {
            b.add(scanner1.next());
        }
        System.out.println("Список B" + b);

        ArrayList<String> c = new ArrayList<>();
        Collections.reverse(b);
        c.add(a.get(0));
        c.add(b.get(0));
        c.add(a.get(1));
        c.add(b.get(1));
        c.add(a.get(2));
        c.add(b.get(2));
        c.add(a.get(3));
        c.add(b.get(3));
        c.add(a.get(4));
        c.add(b.get(4));
        System.out.println("Список С: " + c);

        Collections.sort(c, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else {
                    if (o1.length() < o2.length()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });
        System.out.println("Список С, отсортированный по длине строки: " + c);
    }
}


