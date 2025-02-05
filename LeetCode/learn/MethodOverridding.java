package LeetCode.learn;

 class Animal{
    public void bark(){
        System.out.println("this is dog from animal class");
    }
}
class Dog{
    private Animal a = new Animal();
    public void bark(){
        System.out.println("dog is barking");
    }
}
public class MethodOverridding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}

