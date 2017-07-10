package spring.annotation.autowired2;


public class A {

    B randomb;

    // CONSTRUCTOR
    public A() {
        System.out.println("A CONSTRUCTOR --> a is created");}

    // SETTERS GETTERS
    public B getB() {
        return randomb;
    }

    public void setB(B randomb) {
        this.randomb = randomb;
    }

    // METHODS
    public void print(){
        System.out.println("'A' Print method --> hello a");}

    public void display(){
        System.out.println("Inside display method before print");
        print();
        System.out.println("Inside display method after print");
        randomb.print();
        System.out.println("Inside display method after 'randomb' print");
    }
}
