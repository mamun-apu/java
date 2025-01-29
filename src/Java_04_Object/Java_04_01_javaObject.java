package Java_04_Object;

public class Java_04_01_javaObject {
    String name;
    int age;

   public Java_04_01_javaObject(String name, int age){
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
        Java_04_01_javaObject x = new Java_04_01_javaObject("ab", 28);
        System.out.println(x.getName());
        System.out.println(x.getAge());
    }
}
