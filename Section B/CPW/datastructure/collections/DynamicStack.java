package datastructure.collections;
public class DynamicStack implements Stack{
    int[] items;
    int top =-1;
    public DynamicStack(int size){
        items = new int[size];
    }
    public void push(int item){
        if(top == items.length-1){
            int[] temp = new int[items.length+5];
            for (int x=0; x<items.length; x++){
                temp[x]= items[x];
            }
            temp[++top] = item;
            items = temp;
        }else{
            items[++top] = item;
        }
    }
    public int pop(){
        if(top==-1){
            System.out.println("The stack is empty");
            return 0;
        }else{
            return items[top--];
        }
    }
}