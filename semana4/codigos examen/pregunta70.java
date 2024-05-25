public class pregunta70 {
    public static void main(String[] args) {
        Side primerIntento = new Head();
        Tail segundoIntento = new Tail();
        Coin.overload(primerIntento);
        Coin.overload((Object) segundoIntento);
        Coin.overload(segundoIntento);
        Coin.overload((Side) primerIntento);
    }

    interface Side {
        String getSide();
    }

    class Head implements Side {
        public String getSide() {
            return "Head ";
        }
    }

    class Tail implements Side {
        public String getSide() {
            return "Tail ";
        }
    }

    class Coin {
        public static void overload(Head side) {
            System.out.println(side.getSide());
        }

        public static void overload(Tail side) {
            System.out.println(side.getSide());
        }

        public static void overload(Side side) {
            System.out.println("Side ");
        }

        public static void overload(Object side) {
            System.out.println("Object ");
        }
    }

}