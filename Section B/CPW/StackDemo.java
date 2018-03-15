import datastructure.collections.*;

public class StackDemo{
    public static void main(String[] args){
        Stack st;
        FixedStack fstk = new FixedStack(5);
         st = fstk;
         for(int x=0; x<7;x++){
             st.push(x);
         }
         for(int x=0; x<7;x++){
           System.out.println("Value poped from Fixed stack"+ st.pop());
        }
        DynamicStack dstk = new DynamicStack(5);
        st = dstk;
        for(int x=0; x<7;x++){
            st.push(x);
        }
        for(int x=0; x<7;x++){
          System.out.println("Value poped from Dynamic stack"+ st.pop());
       }
    }
}