public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay(), new Squeak(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck.");
    }
}

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new FlyNoWay(), new MuteQuack(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("I'm a Wooden Duck.");
    }
}

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new FlyWithWings(), new Quack(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("I'm a RedHead Duck.");
    }
}

public class LakeDuck extends Duck {
    public LakeDuck() {
        super(new FlyWithWings(), new Quack(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("I'm a Lake Duck.");
    }
}
