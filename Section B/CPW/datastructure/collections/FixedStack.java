package datastructure.collections;
public class FixedStack implements Stack{
    int[] items;
   public FixedStack(int size){
       items = new int[size];
   }
    int top = -1;
    public void push(int item){
        if(top == items.length-1){
            System.out.println("The stack is full");
        }else{
            items[++top]= item;
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
