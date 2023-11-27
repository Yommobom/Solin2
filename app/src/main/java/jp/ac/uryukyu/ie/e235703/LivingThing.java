package jp.ac.uryukyu.ie.e235703;

public class LivingThing{
    private String name;
    private double hitPoint;
    private int attack;
    private boolean dead;

       //getterメソッド//
   public String getName(){
    return this.name;
   }

   public int getAttack(){
    return this.attack;
   }

   public boolean getDead(){
    return this.dead;
   }

   public void setDead(boolean state){
    dead = state;
}

   public double getHitPoint(){
    return this.hitPoint;
   }

   public void setHitPoint(double aftarHitPoint){
    hitPoint = aftarHitPoint;
   }



   LivingThing(String name,int hitPoint,int attack){
    this.name = name;
    this.hitPoint = hitPoint;
    this.attack = attack;
    dead = false;
   }

   public void attack(LivingThing opponent){
    if(hitPoint > 0){int damage = (int)(Math.random() * attack);
    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
    opponent.wounded(damage);
    }
}

    public void wounded(double damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
}
}
