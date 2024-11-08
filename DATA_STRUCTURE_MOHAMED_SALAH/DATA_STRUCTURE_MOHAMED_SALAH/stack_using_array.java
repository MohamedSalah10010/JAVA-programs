package DATA_STRUCTURE_MOHAMED_SALAH;
public class stack_using_array {
private Double arr[];
private int top;
private int capacity;

stack_using_array(int size) {
arr = new Double[size];
capacity = size;
top = -1;
}

Boolean isEmpty() {
    return top == -1;
    }
Boolean isFull() {
    return top == capacity - 1;
    }

public void push(double x) {
if (isFull()) {
System.out.println("Stack OverFlow");
System.exit(1);
}

System.out.println("PUSH " + x);
arr[++top] = x;
}
public double pop() {
if (isEmpty()) {
System.out.println("Stack is empty");
System.exit(1);
}
return arr[--top];
}
int getSize() {
return top + 1;
}

public void printStack() {
for (int i = 0; i <= top; i++) {
System.out.print(arr[i] + ", ");
}
}

}