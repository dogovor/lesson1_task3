
import java.time.LocalDate;

public class Task3 {
    public static void main(String[] args) {
        LocalDate birthdayDad = LocalDate.of(1975, 12, 28);
        LocalDate birthdayChild = LocalDate.of(1997, 10, 25);
        LocalDate birthdayMum = LocalDate.of(1978, 4, 29);

        System.out.println(daysFromBirthDate(birthdayChild));
        System.out.println(daysFromBirthDate(birthdayMum));
        System.out.println(daysFromBirthDate(birthdayDad));

    }

    private static int daysFromBirthDate(LocalDate as) {
        LocalDate today = LocalDate.now();
        long def = today.toEpochDay() - as.toEpochDay();
        return (int) def;
    }
}
