public abstract class animal {
    abstract void makeSound();
    void eat() {
    System.out.println("i can eat");
}
}
class dog extends animal {
void makeSound() {
    System.out.println("Bark! Bark!");
}
@Override
void eat() {
    System.out.println("the dog is eating the meat");
}

public static void main(String[] args) {
animal now  = new dog();
  now.eat();
  now.makeSound();;
}  
}


