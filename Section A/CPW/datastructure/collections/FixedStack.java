package datastructure.collections;
public class FixedStack extends Items implements Stack{
    private int top = -1;
    public FixedStack(int size){
        super(size);
    }
    public void push(int item){
        if(top == items.length-1){
            System.out.println("Stack is full");
        }else{
            items[++top]=item;
        }
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            return items[top--];
        }
        return -1111;
    }
}