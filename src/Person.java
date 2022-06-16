public class Person {

    private String name;
    private int age;

    public Person() {

    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value;
        this.name = name;
    }
    public String sayHello(){
//TODO: print a message to the console using the person's name
        return String.format("Hello %s",this.name);
    }


    public static void main(String[] args) {
        Person boi = new Person();

        Person rick = new Person();
        boi.setName("dude");

        System.out.println(boi.getName());
        System.out.println(rick.sayHello());
        System.out.println(boi.sayHello());

    }

}
