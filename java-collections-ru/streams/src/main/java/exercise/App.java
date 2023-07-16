package exercise;

import java.util.List;

// BEGIN
class App {

    public static long getCountOfFreeEmails(List<String> list) {
        long emails =
         list.stream()
                .filter(mail -> mail.toString().contains("@gmail.com")
                        || mail.toString().contains("@yandex.ru")
                        || mail.toString().contains("@hotmail.com"))

                .count();
        return emails;
    }
}
// END
