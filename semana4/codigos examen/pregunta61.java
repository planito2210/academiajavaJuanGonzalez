import java.io.FileNotFoundException;

public class pregunta61 {
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        pregunta61.printException(new Exception("B"));
        pregunta61.printException(new FileNotFoundException("A"));
        pregunta61.<Throwable>printException(new Exception("C"));
        pregunta61.<NullPointerException>printException(new NullPointerException("D"));
        pregunta61.printException(new Throwable("E"));
    }
}