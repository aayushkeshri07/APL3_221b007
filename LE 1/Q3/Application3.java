/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Mother {
    void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    @Override
    void show() {
        System.out.println("Hello JUET");
    }
}

public class Application3 {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show(); // Calls Mother's version of show()

        Child ch = new Child();
        ch.show(); // Calls Child's overridden version of show()

        Mother m1 = new Child();
        m1.show(); // Calls Child's overridden version (polymorphism)

        
}
