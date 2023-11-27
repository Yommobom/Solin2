package jp.ac.uryukyu.ie.e235703;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackTest(){
        int defaultWarriorAttack = 10;
        int defaultSlimeHP = 100;
        Warrior demoWarrior = new Warrior("PON骨ゆうた", 1000, defaultWarriorAttack);
        Enemy slime = new Enemy("夏油傑れない", defaultSlimeHP, 10);

        for(int count = 0;count < 5; count ++){
            demoWarrior.attackWithWeponSkill(slime);
        }

        assertEquals((defaultWarriorAttack * 1.5) * 5,defaultSlimeHP - slime.getHitPoint());

    }
}