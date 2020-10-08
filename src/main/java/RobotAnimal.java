public abstract class RobotAnimal implements CommonActions {
    String name;
    int age;
    String producer;
    int maintenanceCycleInDays;

    public RobotAnimal(String name, int age, String producer, int maintenanceCycleInDays) {
        this.name = name;
        this.age = age;
        this.producer = producer;
        this.maintenanceCycleInDays = maintenanceCycleInDays;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RobotAnimal)) {
            return false;
        }

        RobotAnimal otherAnimal = (RobotAnimal) obj;
        return this.name.equals(otherAnimal.name) &&
                this.age == otherAnimal.age;
    }

    @Override
    public String toString() {
        return "name:" + name + ", age:" + age + ", by: " + producer;
    }
}
