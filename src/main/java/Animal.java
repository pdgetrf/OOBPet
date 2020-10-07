public abstract class Animal {
    private String name;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public abstract void play();

    public abstract void play(String toy);

    public abstract void speak();

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
