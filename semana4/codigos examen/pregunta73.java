public abstract class pregunta73 {
    protected abstract void catchAnObject(Object x);

    public static void main(String[] args) {
        java.util.Date now = new java.util.Date();
        pregunta73 target = new MyStringCatcher();
        target.catchAnObject(now);
    }
}

class MyStringCatcher extends pregunta73 {
    public void catchAnObject(Object x) {
        System.out.println("Caught object");
    }

    public void catchAnObject(String s) {
        System.out.println("Caught String");
    }
}