import org.junit.Test;

public class PetsOOPTest {

    @Test
    public void testCat() {
        Cat coco = new Cat(
                "coco",
                "male",
                5
        );

        coco.play();
        coco.speak();
    }

    @Test
    public void testPets() {
        int numOfCats = 3;
        int numOfDogs = 2;

        // animals[] is to hold all the cats and dogs
        Animal[] animals = new Animal[numOfCats + numOfDogs];

        // add cats to animals[]
        String[] catColors = {"white", "red", "black"};
        for (int i = 0; i < numOfCats; i++) {
            animals[i] = new Cat("cat" + i, "he", i + 2, catColors[i]);
        }

        String[] dogOwners = {"Tom", "David"};
        // add dogs to animals[]
        for (int i = 0; i < numOfDogs; i++) {
            animals[numOfCats + i] = new Dog("dogs" + i, "he", i + 2, dogOwners[i]);
        }

        // let all the cats and dogs in the array play using play()
        for (int i = 0; i < animals.length; i++) {
            animals[i].play();  // late binding
        }

        System.out.println(); // add a new line

        // call the overloaded play function
        // let all the dogs in the array play using play()
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {
                continue;
            }
            animals[i].play("chewing bone");
        }
    }

    @Test
    public void testRobotDog() {
        RobotAnimal robotDog = new RobotDog(
                "x1",
                2,
                "bm",
                3,
                350
        );

        System.out.println(robotDog);
        robotDog.play();

    }

    @Test
    public void everyonePlay() {
        CommonActions[] everyone = new CommonActions[3];

        everyone[0] = new Cat(
                "coco",
                "male",
                5
        );

        everyone[1] = new Dog(
                "Sam",
                "male",
                3,
                "Stella"
        );

        everyone[2] = new RobotDog(
                "x1",
                2,
                "bm",
                3,
                350
        );

        for (CommonActions commonActions : everyone) {
            commonActions.play();
        }
    }
}
