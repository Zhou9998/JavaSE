package homework;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(new Test());
        myStack.push(new Test());
        myStack.push(new Test());
        myStack.push(new Test());
        myStack.push(new Test());
        myStack.push(new Test());
        myStack.push(new Test());
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();

    }
}
class Test{

}