public class InheritanceDemo {

    // Parent class
    static class Animal {
        public void display() {
            System.out.println("This is an Animal.");
        }
    }

    // Child class
    static class Dog extends Animal {
        @Override
        public void display() {
            System.out.println("This is a Dog.");
        }
    }

    // Main method
    public static void main(String[] args) {

        Animal a = new Animal();
        Animal d = new Dog();   // Runtime Polymorphism

        System.out.println("Parent Class Output:");
        a.display();

        System.out.println("Child Class Output:");
        d.display();
    }
}