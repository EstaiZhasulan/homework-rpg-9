package com.narxoz.rpg.visitor;

import com.narxoz.rpg.artifact.*;

public class WeightCalculator implements ArtifactVisitor {

    private int totalWeight = 0;

    public int getTotalWeight() { return totalWeight; }

    public String getEncumbranceTier() {
        if (totalWeight <= 20)  return "Light  (no penalty)";
        if (totalWeight <= 50)  return "Medium (-5 speed)";
        if (totalWeight <= 100) return "Heavy  (-15 speed)";
        return "Overloaded! (-30 speed, cannot run)";
    }

    @Override
    public void visit(Weapon weapon) {
        totalWeight += weapon.getWeight();
        System.out.printf("  [WeightCalc] %-22s  %3d kg  (weapon — two-handed grip)%n",
                weapon.getName(), weapon.getWeight());
    }

    @Override
    public void visit(Potion potion) {
        totalWeight += potion.getWeight();
        System.out.printf("  [WeightCalc] %-22s  %3d kg  (potion — liquid mass)%n",
                potion.getName(), potion.getWeight());
    }

    @Override
    public void visit(Scroll scroll) {
        totalWeight += scroll.getWeight();
        System.out.printf("  [WeightCalc] %-22s  %3d kg  (scroll — parchment roll)%n",
                scroll.getName(), scroll.getWeight());
    }

    @Override
    public void visit(Ring ring) {
        totalWeight += ring.getWeight();
        System.out.printf("  [WeightCalc] %-22s  %3d kg  (ring — negligible mass)%n",
                ring.getName(), ring.getWeight());
    }

    @Override
    public void visit(Armor armor) {
        totalWeight += armor.getWeight();
        System.out.printf("  [WeightCalc] %-22s  %3d kg  (armor — heavy plating)%n",
                armor.getName(), armor.getWeight());
    }
}
