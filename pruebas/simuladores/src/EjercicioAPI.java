import java.util.ArrayList;
import java.util.List;

public class EjercicioAPI {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoodler");
        b1.append(b2.substring(2, 5).toUpperCase());
        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("-------------------------------");
        StringBuilder b3 = new StringBuilder("snorkler");
        StringBuilder b4 = new StringBuilder("yoodler");
        b4.insert(3, b3.append("a"));
        System.out.println("b1: " + b3);
        System.out.println("b2: " + b4);
        System.out.println("-------------------------------");
        StringBuilder b5 = new StringBuilder("snorkler");
        StringBuilder b6 = new StringBuilder("yoodler");
        b5.replace(3, 4, b2.substring(4)).append(b2.append(false));
        System.out.println("b1: " + b5);
        System.out.println("b2: " + b6);
        System.out.println("-------------------------------");
        List s1 = new ArrayList();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("a");
        if (s1.remove("a")) {
            if (s1.remove("a")) {
                s1.remove("b");
            } else {
                s1.remove("c");
            }
        }
        System.out.println(s1);
        System.out.println("-------------------------------");
        StringWrapper sw = new StringWrapper("How are you?");
        StringBuilder sb = new StringBuilder("How are you?");
        System.out.println("Hello, " + sw);
        System.out.println("Hello, " + sb);
    }
}

class StringWrapper {
    private String theVal;

    public StringWrapper(String str) {
        this.theVal = str;
    }
}

class Logger {
    private StringBuilder sb = new StringBuilder();

    public void logMsg(String location, String message) {
        sb.append(location);
        sb.append("-");
        sb.append(message);
    }

    public void dumpLog() {
        System.out.println(sb.toString());
        // Empty the contents of sb here
        sb.delete(0, sb.length());
    }
}