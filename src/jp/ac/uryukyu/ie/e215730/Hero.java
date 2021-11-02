package jp.ac.uryukyu.ie.e215730;

public class Hero {
  public String name;  // 名前の宣言
  public int hp;  // HPの宣言
  public Sword sword;

  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }

  public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println("HPが" + sec + "ポイント回復した！");
  }

  public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ！");
  }

  public void run() {
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }

  public void attack() {
    System.out.println(this.name + "は攻撃した！");
    System.out.println("敵に5ポイントのダメージをあたえた！");
  }

  // コンストラクタ(constructor)
  public Hero(String name) {
    this.hp = 100;  // hpフィールドを100で初期化
    this.name = name;
  }

  public Hero() {
    this("defaultHero");
  }
}
