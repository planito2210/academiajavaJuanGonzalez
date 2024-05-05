public class App {
    
    public static void main(String args[]) {
        Object ref1 = new Object();
        Object ref2, ref3 = new Object();
        ref2=ref3;//apuntan al mismo objeto
        System.out.println("Referencia 1 apunta a "+ref1);
        System.out.println("Referencia 2 apunta a "+ref2);
        System.out.println("Referencia 3 apunta a "+ref3);
        ref2=null;//desconectado
        System.out.println("Referencia 1 ahora apunta a "+ref1);
        System.out.println("Referencia 2 ahora apunta a "+ref2);
        System.out.println("Referencia 3 ahora apunta a "+ref3);

        System.out.println("Referencia 1 manipulando su objeto: "+ref1.toString());
        System.out.println("Referencia 2 manipulando su objeto: "+ref2.toString());
        System.out.println("Referencia 3 manipulando su objeto: "+ref3.toString());
    }
}
