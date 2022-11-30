import PhoneBook.PhoneBook;
import PhoneBook.FullName;

import java.util.Map;
import java.util.Random;

public class HashMap {
    private final static Random RANDOM = new Random();
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        while (phoneBook.getEntries().size() < 20) {
            phoneBook.addPhone(getRandomName(), getPhoneNumber());
        }
        for (Map.Entry<FullName,String> entry:
             phoneBook.getEntries()) {
            System.out.printf("Имя Фамилия:  %s , телефон:  +79%s\n",entry.getKey(),entry.getValue());
        }

    }
//генертаор случайного имени
    public static FullName getRandomName() {
        String name = "Test" + RANDOM.nextInt(1, 10000000);
        String lastName = "TestLAst" + RANDOM.nextInt(1, 1568);
        return new FullName(name, lastName);
    }
//генератор случайного телефона
    public static String getPhoneNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            stringBuilder.append(RANDOM.nextInt(0, 10));
        }
        return stringBuilder.toString();
    }
}