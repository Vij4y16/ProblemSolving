
class Human{
    private int age;
    private String name;



    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String b){
        name =b;
    }
}


public class Encapsulation {
    public static void main(String[] args) {

        Human obj = new Human();
        obj.setName("mai");
        obj.setAge(21);
        System.out.println(obj.getName() + ":" +obj.getAge());

    }
}
