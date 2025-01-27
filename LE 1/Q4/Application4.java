/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class One {
    One(int x) {
        System.out.println("Parameterized constructor of One: x = " + x);
    }
}

class Two extends One {
    Two(int x) {
        super(x); // Must explicitly call the parent class constructor
        System.out.println("Constructor of Two.");
    }
}

class Application4 {
    public static void main(String[] args) {
        Two obj = new Two(10); // Calls parameterized constructors
    }
}

