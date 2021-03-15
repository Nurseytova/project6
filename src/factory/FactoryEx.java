package factory;

public class FactoryEx {
    public static void main(String[] args){
        Factory factory= new Factory();
        Laptop lenovo= factory.create("Lenovo");
        Laptop acer= factory.create("Acer");
        Laptop hp= factory.create("HP");
        lenovo.use();
        acer.use();
        hp.use();
    }
}

interface Laptop{
    void use();
}
class Lenovo implements Laptop{
    public void use(){
        System.out.println("Using Lenovo");
    }
}
class Acer implements Laptop{
    public void use(){
        System.out.println("Using Acer");
    }
}
class HP implements Laptop{
    public void use(){
        System.out.println("Using HP");
    }
}

class Factory{
    public Laptop create(String typeOfLaptop){
        switch (typeOfLaptop){
            case "Lenovo" : return new Lenovo();
            case "Acer" : return new Acer();
            case "HP" : return new HP();
            default: return null;
        }
    }
}
