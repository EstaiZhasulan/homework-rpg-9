package com.narxoz.rpg.visitor;

import com.narxoz.rpg.artifact.*;

public class GoldAppraiser implements ArtifactVisitor {

    private int totalValue = 0;

    public int getTotalValue() { return totalValue; }

    @Override
    public void visit(Weapon weapon) {
        int appraisal = (int)(weapon.getValue() * 1.5 + weapon.getAttackBonus() * 10);
        totalValue += appraisal;
        System.out.printf("  [GoldAppraiser] %-22s -> %4d gold  (weapon ×1.5 + ATK bonus)%n",
                weapon.getName(), appraisal);
    }

    @Override
    public void visit(Potion potion) {
    }

    @Override
    public void visit(Scroll scroll) {
    }

    @Override
    public void visit(Ring ring) {
    }

    @Override
    public void visit(Armor armor) {
        int appraisal = (int)(armor.getValue() * 1.3 + armor.getDefenseBonus() * 8);
        totalValue += appraisal;
        System.out.printf("  [GoldAppraiser] %-22s -> %4d gold  (armor ×1.3 + DEF bonus)%n",
                armor.getName(), appraisal);
    }

}