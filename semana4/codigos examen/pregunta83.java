import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class pregunta83 {
    public static void main(String[] args) {
        List list = Arrays.asList(25, 7, 25, 67);
        System.out.println(list);
        System.out.println(new HashSet(list));
        System.out.println(new TreeSet(list));
        System.out.println(new HashSet(list));
        System.out.println(new ConcurrentSkipListSet(list));
    }
}
