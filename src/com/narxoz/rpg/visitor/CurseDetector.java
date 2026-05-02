package com.narxoz.rpg.visitor;

import com.narxoz.rpg.artifact.*;

public class GoldAppraiser implements ArtifactVisitor {

    private int totalValue = 0;

    public int getTotalValue() { return totalValue; }

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