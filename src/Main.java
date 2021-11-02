import jp.ac.uryukyu.ie.e215730.*;

public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero("ミナト");
    Hero h2 = new Hero("アサカ");

    Wizard w = new Wizard("スガワラ");

    Sword s = new Sword("炎の剣", 10);
    h1.sword = s;

    Matango m1 = new Matango(100, 'A');
    Matango m2 = new Matango(48, 'B');

    System.out.println("勇者" + h1.name + "を生み出しました！");

    h1.sit(5);
    h1.slip();
    h1.sit(25);
    h1.run();

    h1.slip();
    m1.run();
    m2.run();
    h1.run();

    System.out.println("現在の武器は" + h1.sword.name);

    w.heal(h1);
    w.heal(h2);
    w.heal(h2);
  }
}
