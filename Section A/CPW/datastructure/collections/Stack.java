package datastructure.collections;
public interface Stack{
    void push(int item);
    int pop();
}
class Items{
    int[] items;
    public Items(int size){
        items = new int[size];
    }
}