package cz.test;

public class Hello {
    public static void main (String[] args) throws Exception {
        if (args.length < 1) {
            throw new IllegalArgumentException("Chybí parametr");
        }
        System.out.println(args[0]);
    }
}
