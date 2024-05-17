public class pregunta17 {
    public static void main(String[] args) {
        String sPalabra = "palabra";
        int inc = 0;
        int des = sPalabra.length() - 1;
        boolean bError = false;
        while ((inc < des) && (!bError)) {
            if (sPalabra.charAt(inc) == sPalabra.charAt(des)) {
                inc++;
                des--;
            } else {
                bError = true;
            }
        }
    }
}
