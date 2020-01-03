package property;

import charactor.Hero;

/**
 * @author : liulinzhi
 * @date: 2020/01/02/15:49
 * @description:
 */
public class Item {
    public String name;
    public int price;

    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果");
    }

    public String toString(){
      return this.name + this.price;
 }

        public void finalize(){
            System.out.println("这个item正在被回收");
        }

        public boolean equals(Object o){
            if(o instanceof Item){
                Item h = (Item) o;
                return this.price == h.price;
            }
            return false;
        }

}
