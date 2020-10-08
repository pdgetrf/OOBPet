public abstract class Animal implements CommonActions {
    String name;
    String gender;
    int age;

    public Animal(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Animal)) {
            return false;
        }

        Animal otherAnimal = (Animal) obj;
        return this.name.equals(otherAnimal.name) &&
                this.gender.equals(otherAnimal.gender) &&
                this.age == otherAnimal.age;
    }

    @Override
    public String toString() {
        return "name:" + name + ", gender:" + gender + ", age:" + age;
    }
}
