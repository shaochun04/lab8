import java.util.LinkedList;

class MyStack<T> {

    // 用 JCF 的 LinkedList 當作底層儲存結構
    private LinkedList<T> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    // push: 把元素放到 stack 頂端
    public void push(T item) {
        stack.addLast(item); // 末端當作堆疊頂端
    }

    // pop: 取出並回傳頂端元素（LIFO）
    public T pop() {
        // 若為空，removeLast() 會丟 NoSuchElementException
        return stack.removeLast();
    }

    // 檢查栈是否為空
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // 返回栈中的元素數量
    public int size() {
        return stack.size();
    }
}

public class StackExample {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        // do some test if needed
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // 20
        System.out.println(stack.pop()); // 10
        System.out.println(stack.isEmpty()); // true
    }
}



//我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------
