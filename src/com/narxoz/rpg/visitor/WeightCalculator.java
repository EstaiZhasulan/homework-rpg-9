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
    }
}