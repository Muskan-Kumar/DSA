

public class Interface{
    public static void main(String[] args) {
        Car car = new Car();
        
        car.start();
        car.stop();
        car.brake();
        car.acc();

        Media a = new Car();
        a.start();
    }
}

interface Engine{
    void start();
    void stop();
    void acc();
}

interface Brake{
    void brake();
}

interface Media{
    void start();
    void stop();
}

class Car implements Engine, Brake, Media{

    @Override
    public void start(){
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void brake(){
        System.out.println("I brake like a normal car");
    }


    @Override
    public void stop(){
        System.out.println("I stop engine like a normal car");
    }

    @Override
    public void acc(){
        System.out.println("I acc like a normal car");
    }
}