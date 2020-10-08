public class RobotDog extends RobotAnimal {
    int numberOfLegs;

    public RobotDog(String name, int age, String producer, int maintenanceCycleInDays, int numberOfLegs) {
        super(name, age, producer, maintenanceCycleInDays);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void play() {
        System.out.println("Robot dog " + name + "zig zag zig zag");
    }

    @Override
    public void play(String toy) {
        System.out.println("Robot dog " + name + "zig zag zig zag" + toy);
    }

    @Override
    public void speak() {
        System.out.println("Robot dog " + name + " says: beep! beep!");
    }
}


