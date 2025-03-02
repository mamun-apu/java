package Java_07_DSA;

import java.util.Stack;

public class Java_07_02_stack {
    public static void main(String[] args){
        //stack = LIFO data structure. Last-In First-Out
        //      Stores objects into a sort of "vertical tower"
        //      push() to add to the top
        //      pop() to remove from the top
        Stack<String> stack = new Stack<>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("PUBG");
        stack.push("FFVII");
        System.out.print("Orgiginal stack: ");
        System.out.println(stack);
        System.out.println("excecutes stack.pop()");
        stack.pop();
        System.out.println(stack);
        System.out.println("excecutes stack.push(\"Hello\")");
        stack.push("Hello");
        System.out.println(stack);
        stack.pop();
        String myFavGame = stack.pop(); //removes the item and stores it into myFavGame
        System.out.println("My favourite game: " + myFavGame);
        System.out.println("Original stack: " + stack);
        String lastGame = stack.peek(); //doesn't remove the item, only stores the last item
        // into lastGame
        System.out.println("The last game: " + lastGame);
        System.out.println("Original stack: " + stack);
        System.out.println("last game index: " + stack.search(lastGame));
        stack.push("Skyrim");
        System.out.println(stack);
        stack.remove("Skyrim");
        System.out.println(stack);
    }
}
