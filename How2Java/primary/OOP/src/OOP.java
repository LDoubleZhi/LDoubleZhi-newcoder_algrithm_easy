/**
 * @author : liulinzhi
 * @date: 2019/12/28/12:26
 * @description:
 */
class Hero{//captalize the class's initial
    String name;
    float hp;
    float armor;
    int moveSpeed;
        }


class Item{
    String name;
    int price;
}

public class OOP {
    public static void main(String[] args){
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616f;//float需要f后缀，否则视为double
        garen.armor = 27f;
        garen.moveSpeed = 350;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;

        Item bloodVial = new Item();
        bloodVial.name = "血瓶";
        bloodVial.price = 50;

        Item shoe= new Item();
        shoe.name = "草鞋";
        shoe.price = 300;

        Item sword = new Item();
        sword.name = "长剑";
        sword.price = 350;

    }
}
