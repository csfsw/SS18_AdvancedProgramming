public class Employee{
    private static int lastid=0;
    private int id;
    private String name;
    private String position;
    public Employee(){
        id = ++lastid;
    }
    public Employee(String name, String position){
        id = ++lastid;
        this.name = name;
        this.position = position;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPostion(String position){
        this.position = position;
    }
    public String getPosition(){
        return this.position;
    }
}