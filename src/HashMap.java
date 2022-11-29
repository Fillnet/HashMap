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
            System.out.printf("Имя Фамилия:  %s , телефон:  %s\n",entry.getKey(),entry.getValue());
        }

//        PhoneBook phoneBook = new PhoneBook();
//        phoneBook.addPhone(new FullName("Иванов", "Иван"),"6546546545");
//        phoneBook.addPhone(new FullName("Иванов","А.А."),"89525689");
//        phoneBook.addPhone(new FullName("ИВанов","И.И."),"78452589");
//        phoneBook.addPhone(new FullName("Иванов","П.А."),"7896547859");
//        phoneBook.addPhone(new FullName("Петров","Р.О."),"8789423136");
//        phoneBook.addPhone(new FullName("Петров","Г.К."),"879554856");
//        phoneBook.addPhone(new FullName("Петров","А.Г."),"897522658");
//        phoneBook.addPhone(new FullName("Петров","Б.Г."),"8997522658");
//        phoneBook.addPhone(new FullName("Петров","А.В."),"89975254658");
//        phoneBook.addPhone(new FullName("Петров","Б.В."),"8997526858");
//        phoneBook.addPhone(new FullName("Петров","В.З."),"899775262558");
//        phoneBook.addPhone(new FullName("Петров","У.З."),"89977526584");
//        phoneBook.addPhone(new FullName("Петров","Е.З."),"89977752658");
//        phoneBook.addPhone(new FullName("Петров","О.З."),"89977512658");
//        phoneBook.addPhone(new FullName("Петров","Ф.З."),"89977524658");
//        phoneBook.addPhone(new FullName("Петров","Ч.З."),"89977526558");
//        phoneBook.addPhone(new FullName("Петров","С.З."),"89977526858");
//        phoneBook.addPhone(new FullName("Петров","Я.З."),"899775266558");
//        phoneBook.addPhone(new FullName("Петров","Л.З."),"89977752658");
//        phoneBook.addPhone(new FullName("Петров","Н.З."),"89752658");
//        phoneBook.addPhone(new FullName("Петров","М.З."),"89497752658");

//        System.out.println(phoneBook.getEntries());


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
        for (int i = 0; i < 11; i++) {
            stringBuilder.append(RANDOM.nextInt(1, 10));
        }
        return stringBuilder.toString();
    }
}