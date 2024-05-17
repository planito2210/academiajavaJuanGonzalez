class Mammal {
    public Mammal(int age) {
        System.out.println("Mammal");
    }
}

public class pregunta10 extends Mammal {
    public pregunta10() {
        System.out.println("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}
