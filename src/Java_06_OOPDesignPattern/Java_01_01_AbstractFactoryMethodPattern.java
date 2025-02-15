package Java_06_OOPDesignPattern;

public class Java_01_01_AbstractFactoryMethodPattern {
    public static void main(String[] args){
        GUIFactory factory = null;
        factory = new WindowsFactory();
        factory.createButton().showButton();
        factory.createCheckbox().showCheckbox();
        factory.createMenu().showMenu();

        factory = new MacFactory();
        factory.createButton().showButton();
        factory.createCheckbox().showCheckbox();
        factory.createMenu().showMenu();

        factory = new LinuxFactory();
        factory.createButton().showButton();
        factory.createCheckbox().showCheckbox();
        factory.createMenu().showMenu();
    /*
        The abstract factory pattern is a creational design pattern
        that provides an interface for creating families of related or
        dependant objects without specifying their concrete classes.
        to ensure scalability and maintainability

        Basically, It is a layer over the factory method pattern,
     */
    }
}
/*-----Interfaces-------*/
interface Button{
    void showButton();
}
interface Checkbox{
    void showCheckbox();
}
interface Menu{
    void showMenu();
}

interface GUIFactory{
    Button createButton();
    Checkbox createCheckbox();
    Menu createMenu();
}

// -------Concrete classes-------

// -------Concrete Button-------
class WindowsButton implements Button{
    @Override
    public void showButton(){
        System.out.println("Win button");
    }
}
class MacButton implements Button{
    @Override
    public void showButton(){
        System.out.println("Mac button");
    }
}
class LinuxButton implements Button{
    @Override
    public void showButton(){
        System.out.println("Linux button!");
    }
}

// -------Concrete Checkbox-------
class WindowsCheckbox implements Checkbox{
    @Override
    public void showCheckbox(){
        System.out.println("Windows checkbox");
    }
}
class MacCheckbox implements Checkbox{
    @Override
    public void showCheckbox(){
        System.out.println("Mac checkbox");
    }
}
class LinuxCheckbox implements Checkbox{
    @Override
    public void showCheckbox(){
        System.out.println("Linux checkbox");
    }
}

// -------Concrete Menu-------
class WindowsMenu implements Menu{
    @Override
    public void showMenu(){
        System.out.println("Windows Menu");
    }
}

class MacMenu implements Menu{
    @Override
    public void showMenu(){
        System.out.println("Mac menu");
    }
}
class LinuxMenu implements Menu{
    @Override
    public void showMenu(){
        System.out.println("Linux menu");
    }
}
//Concrete factory
class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }

    @Override
    public Menu createMenu(){
        return new WindowsMenu();
    }
}
class MacFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new MacCheckbox();
    }
    @Override
    public Menu createMenu(){
        return new MacMenu();
    }

}
class LinuxFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new LinuxCheckbox();
    }

    @Override
    public Menu createMenu(){
        return new LinuxMenu();
    }
}
