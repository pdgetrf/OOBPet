public class Cat extends Animal {

    private String furColor;

    public Cat(String name, String gender, int age) {
        // calling the base class constructor
        super(name, gender, age);

        furColor = "known color";
    }


    public Cat(String name, String gender, int age, String furColor) {
        // calling the base class constructor
        super(name, gender, age);

        // set cat specific property
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    // cat specific method
    void purr() {
        System.out.println("Cat " + name + ": Purrrrrrr...");
    }

    @Override
    public void speak() {
        System.out.println("Cat " + name + " says 'Meow!'");
    }

    @Override
    public void play() {
        System.out.println("Cat " + name + " jumps on a kitchen table");
    }

    // an overload of function play with different argument
    // this also override Animal.play(String)
    @Override
    public void play(String toy) {
        if (toy == null || toy.isBlank()) {
            return;
        }
        System.out.println("Cat " + name + " is playing with " + toy);
    }

}


