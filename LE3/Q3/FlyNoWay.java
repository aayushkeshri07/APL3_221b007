
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}


public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("...");
    }
}

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

public class Swim implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("I'm swimming!");
    }
}
