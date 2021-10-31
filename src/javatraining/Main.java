package javatraining;

public class Main {
    public static void main(String[] args) {
        Statics.counter++;
        new Statics();

        Statics.justAMethod();
        new Statics().justAMethod();

        Statics myStatics = new Statics();

        System.out.println(Statics.counter);
        System.out.println(myStatics.counter);

        myStatics = null;

        System.out.println(Statics.counter);
        System.out.println(myStatics.counter);
    }
}
