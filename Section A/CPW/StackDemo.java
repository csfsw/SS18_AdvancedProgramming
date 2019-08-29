import datastructure.collections.*;
public class StackDemo{
    public static void main(String[] args){
        Stack stk;
        FixedStack fstk = new FixedStack(5);
        stk = fstk;
        for(int i=0; i<7; i++){
            stk.push(i+1);
        }
        for(int i=0; i<7;i++){
            System.out.println("Value poped from Fixed Stack: "+stk.pop());
        }
        DynamicStack dstk = new DynamicStack(5);
        stk = dstk;
        for(int i=0; i<7; i++){
            stk.push(i+1);
        }
        for(int i=0; i<7;i++){
            System.out.println("Value poped from Fixed Stack: "+stk.pop());
        }
    }
}