import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class ejercicioAPIfecha {
    public static void main(String[] args) throws Exception {
        // You want to print the date that represents upcoming tuesday from now even if
        // the current day is a tuesday. Which of the following lines of code
        // accomplishe(s) this?
        System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)));

        System.out.println(LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY)));
        // This will return today's date if it is a tuesday, which is not what the
        // question wants.

        // System.out.println(new
        // LocalDate().with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
        // You cannot create a LocalDate object using its constructor because it is
        // private.

        // System.out.println(new
        // LocalDate().adjust(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
        // adjust is not a valid method in LocalDate.

        System.out.println(TemporalAdjusters.next(DayOfWeek.WEDNESDAY).adjustInto(LocalDate.now()));

        List list = new ArrayList();
        list.add("val1"); // 1
        list.add(2, "val2"); // 2
        list.add(1, "val3"); // 3
        System.out.println(list);
        // } }
    }

    public LocalDate process(LocalDate ld) {
        LocalDate ld2 = ld.plus(0, null);
        return ld2;
    }
}
