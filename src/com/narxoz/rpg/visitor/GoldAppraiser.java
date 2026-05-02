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
        int appraisal = (int)(potion.getValue() * 0.8);
        totalValue += appraisal;
        System.out.printf("  [GoldAppraiser] %-22s -> %4d gold  (potions depreciate ×0.8)%n",
                potion.getName(), appraisal);
    }

    @Override
    public void visit(Scroll scroll) {
        int appraisal = (int)(scroll.getValue() * 1.2);
        totalValue += appraisal;
        System.out.printf("  [GoldAppraiser] %-22s -> %4d gold  (scroll markup ×1.2)%n",
                scroll.getName(), appraisal);
    }

    @Override
    public void visit(Ring ring) {
        int appraisal = (int)(ring.getValue() * 2.0 + ring.getMagicBonus() * 15);
        totalValue += appraisal;
        System.out.printf("  [GoldAppraiser] %-22s -> %4d gold  (ring ×2.0 + magic bonus)%n",
                ring.getName(), appraisal);
    }

    @Override
    public void visit(Armor armor) {
        int appraisal = (int)(armor.getValue() * 1.3 + armor.getDefenseBonus() * 8);
        totalValue += appraisal;
        System.out.printf("  [GoldAppraiser] %-22s -> %4d gold  (armor ×1.3 + DEF bonus)%n",
                armor.getName(), appraisal);
    }

}