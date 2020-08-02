package projetopulapula;

public class Kid {
    //VARIAVEIS
    private String name;
    private int age;
    
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setAge(int a){
        this.age = a;
    }
    public String toString(){
        return name + ": " + age;
    }
    
    public Kid (String name, int age){
        this.name = name;
        this.age = age;
    }
}
