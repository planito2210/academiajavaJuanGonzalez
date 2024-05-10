public class ExceptionTest {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Ejecutando try");
            // m2();
        } catch (Exception e) {
            System.out.println("Ejecutando catch " + e);
        } finally {
            System.out.println("Ejecutando finally");
            m3();
        }
    }

    public static void m2() throws NewException {
        System.out.println("Arrojando NewException");
        throw new NewException();
    }

    public static void m3() throws AnotherException {
        System.out.println("Arrojando AnotherException");
        throw new AnotherException();
    }
}

class NewException extends Exception {
}

class AnotherException extends Exception {
}
