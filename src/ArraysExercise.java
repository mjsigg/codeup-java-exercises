import java.util.Arrays;

public class ArraysExercise {

    public ArraysExercise () {}

    static String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    static String[] foodForTonight = {"4x4 Protein Style", "Maybe a shake", "Fries Animal style"};

    public int addPerson(Person[] array, Person thing) {
        return array.length + 1;
    }

    public static void main(String[] args) {

        for (String i : cars) {
            System.out.println(i);
        }

        for (String food: foodForTonight) {
            System.out.println(food);
        }

        Person[] people = new Person[3];
        people[0] = new Person("Billy");
        people[1] = new Person("Dave");
        people[2] = new Person("Derek");
        
//        for(Person i: people) {
//            System.out.println(Arrays.toString(people[Person ]));
//        }

        System.out.println(people);
        System.out.println(Arrays.toString(foodForTonight));

    }

}

//
//    String[] languages = {"html", "css", "javascript", "java"};
//
//for (String language : languages) {
//        System.out.println(language);
//        }