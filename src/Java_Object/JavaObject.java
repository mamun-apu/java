package Java_Object;

public class JavaObject{
    String name;
    int age;

   public JavaObject(String name, int age){
       this.name = name;
       this.age = age;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args)
    {
        JavaObject x = new JavaObject("ab", 28);
        System.out.println(x.getName());
        System.out.println(x.getAge());
    }
}
