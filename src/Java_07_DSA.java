import java.util.ArrayList;
import java.util.Arrays;

public class Java_07_DSA {
    public static void main(String[] args) {
        String[] myFriends = {
                "hello", "World", "how", "are", "you!"
        };

        String[] myFriends2 = new String[5];
        myFriends2[0] = "hello";
        myFriends2[1] = "world";
        myFriends2[2] = "how";
        myFriends2[3] = "are";
        myFriends2[4] = "you";

        for(String name: myFriends){
            System.out.println(name);
        }
        System.out.println("----");
        for(String name: myFriends2){
            System.out.println(name);
        }
        System.out.println("----");

        ArrayList<String> myFriends3 = new ArrayList<>(Arrays.asList(myFriends2));
        myFriends3.add("hi");
        System.out.println(myFriends3.getFirst());
        myFriends3.set(0, "yo");
        System.out.println(myFriends3.get(1));
        System.out.println(myFriends3);

        myFriends3.remove(1);
        System.out.println(myFriends3);
        myFriends3.remove("yo");

        System.out.println(myFriends3);

        System.out.println("*****************");
    }
}
