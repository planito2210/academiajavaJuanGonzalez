public class pregunta9 {

    public static void main(String[] args) {
        String cad1 = "hola";
        String cad2 = new String("hola");
        String cad3 = "hola";
        if (cad1 == cad2) {
            System.out.println("cad1 es igual a cad2");
        } else {
            System.out.println("cad1 diferente a cad2");
        }
        if (cad1 == cad3) {
            System.out.println("cad1 es igual a cad3");
        } else {
            System.out.println("cad1 es diferente a cad3");
        }
    }
}