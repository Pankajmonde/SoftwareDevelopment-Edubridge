
package Oops;
abstract class Calci {

    abstract void add(int a, int b);

    abstract void sub(int a, int b);
}

class Math extends Calci {

    @Override
    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    @Override
    void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
}

public class Abstractt {

    public static void main(String[] args) {

        Math m = new Math();

        m.add(10, 20);
        m.sub(20, 10);
    }
}