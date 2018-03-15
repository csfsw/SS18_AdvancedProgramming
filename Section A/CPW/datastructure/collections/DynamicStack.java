package datastructure.collections;
public class DynamicStack extends Items implements Stack{
    private int top=-1;
    public DynamicStack(int size){
        super(size);
    }
    public void push(int item){
        if(top == items.length-1){
            int[] temp = new int[items.length+5];
            for(int i=0; i<items.length; i++){
                temp[i]= items[i];
            }
            temp[++top]=item;
            items = temp;
        }else{
            items[++top] = item;
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