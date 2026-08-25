import java.util.Stack;
class learnStack{
    public static  void main(String[] args){
        Stack<String> animal= new Stack<>();

        animal.push("Lion");
        animal.push("Tiger");
        animal.push("Monkey");
        animal.push("Rat");
        animal.push("Bear");
        System.out.println("Stack is: "+ animal);

        //to see the latest / top on the stack animal
        System.out.println("the top animal: "+ animal.peek());

        //to remove animal but it removes the top/peek 1st
        animal.pop();
        System.out.println("After removing the Stack is: "+ animal);
    }

}