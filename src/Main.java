public class Main {
    public static void main(String[] args) {

            MyList ml = new MyList();
            ml.addLast("tatu");
            ml.add("toto");
            ml.add("titi");
            ml.addLast("tutu");
            System.out.println(ml);
            System.out.println(ml.get(15));
            System.out.println(ml.get(2));
            System.out.println(ml.sumLetters());

    }
}
