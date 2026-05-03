package com.narxoz.rpg.visitor;

import com.narxoz.rpg.artifact.*;

public class EnchantmentScanner implements ArtifactVisitor {

    private int enchantedCount = 0;

    public int getEnchantedCount() { return enchantedCount; }

    @Override
    public void visit(Weapon weapon) {
    }

    @Override
    public void visit(Potion potion) {
    }

    @Override
    public void visit(Scroll scroll) {
        enchantedCount++;
        System.out.println("  [EnchantmentScanner] " + scroll.getName()
                + " — ARCANE SCROLL! Spell: [" + scroll.getSpellName()
                + "]. High enchantment density.");
    }

    @Override
    public void visit(Ring ring) {
        if (ring.getMagicBonus() > 0) {
            enchantedCount++;
            System.out.println("  [EnchantmentScanner] " + ring.getName()
                    + " — ENCHANTED RING! Magic bonus: +" + ring.getMagicBonus());
        } else {
            System.out.println("  [EnchantmentScanner] " + ring.getName()
                    + " — plain ring. No magic detected.");
        }
    }

    @Override
    public void visit(Armor armor) {
    }
}