public class Dog {
    static int count;
    String breed;
    int age;
    String color;

    public Dog(int age){
        this.age = age;
        System.out.println("age:"+age);
    }

    void barking() {
        System.out.println("dog1");
    }

    void hungry() {
    }

    void sleeping() {
    }

    public static void main(String[] args){
        Dog dog1 = new Dog(25);
        dog1.barking();
        System.out.println(dog1.age);
    }
}