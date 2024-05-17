class ClassX {
    static int y = 2;

    ClassX(int x) {
        this();
        y = y * 2;
    }

    ClassX() {
        y++;
    }
}

public class pregunta31 extends ClassX {
    pregunta31() {
        super(y);
        y = y + 3;
    }

    public static void main(String[] args) {
        new pregunta31();
        System.out.println(y);
    }
}