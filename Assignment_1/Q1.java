interface Animals{
    void sound()
    void type()
    void age()
}

abstract class Dog {
    //Regular method
    public static void bark(){
        System.out.println("Bark")
    }
    //Abstract Method
    public abstract void age()
}

class Dobberman extends Dog{
    //Defining Abstract method
    public void age(){
        System.out.println("5 years old")
    }
}

class Cat implements Animals{
    public static void sound(){
       System.out.println("Meow") 
    }
    public static void type(){
       System.out.println("Omnivore") 
    }
    public abstract static void age()
} 

class Persian extends Cat{
    public void age(){
        System.out.println("2 years old")
    }
}

class Q1{
    public static void main(String args[]){
        Dobberman d = new Dobberman()
        Persian p = new Persian()
        d.bark()
        d.age()
        p.sound()
        p.type()
        p.age()
    }
}