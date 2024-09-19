package SOLID;

interface Runnable {
    void run();
}
interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}

class Aligator implements Runnable,Swimmable {
    @Override
    public void run() {
        System.out.println("Aligator can running");
    }
    @Override
    public void swim() {
        System.out.println("Aligator swimming");
    }
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird flying");
    }
}
class Dog implements Runnable {
    @Override
    public void run() {
        System.out.println("Dog can running");
    }
}