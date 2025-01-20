/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// String name
// setspeed
// setname
// getspeed
// getname
public class Main
{
	public static void main(String[] args) {

        Car c1 = new Car();
        c1.setspeed(140);
        c1.setname("maruti Dzire");
        c1.setMileage(24.70);
        
        // String name = c1.getName();
        // int speed = c1.getSpeed();
        // double mileage = c1.getmileage();
        
        // System.out.println(name);
        // System.out.println(speed);
        // System.out.println(mileage);
        
        System.out.println(c1.getName());
        System.out.println(c1.getSpeed());
        System.out.println(c1.getmileage());
        
        
	}
}

class Car{
    private String carName;
    private int carSpeed;
    private double carMileage;
    
    public void setname(String name){
        this.carName = name;
    }
    public void setspeed(int speed){
        if(speed<=150){
        this.carSpeed = speed;
        }else{
            System.out.println("cannot set speed greater than 150");
        }
    }
    public void setMileage(double Mileage){
        this.carMileage = Mileage;
    }
    
    public String getName()
    {
        return carName;
    }
    
    public int getSpeed()
    {
        return carSpeed;
    }
    
    public double getmileage()
    {
        return carMileage;
    }
    
}