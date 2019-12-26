/**
 * @author : liulinzhi
 * @date: 2019/12/26/11:05
 * @description:
 */
class Dog {
    int size;
    String bread;
    String name;

    void bark(){
        System.out.println("Ruff! Ruff!!");
    }
}
public class DogTestDrive {
    public static void main(String[] args){
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}
