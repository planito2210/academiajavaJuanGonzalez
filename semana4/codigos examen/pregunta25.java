public class pregunta25 extends Concreate {
    pregunta25() {
        System.out.println("t ");
    }

    public static void main(String[] args) {
        new pregunta25();
    }
}

class Concreate extends Send {
    Concreate() {
        System.out.println("c ");
    }

    private Concreate(String s) {

    }
}

abstract class Send {
    Send() {
        System.out.println("s ");
    }
}